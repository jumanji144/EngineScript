package enginescript.runtime.vm;

import enginescript.EngineParser.EngineScriptVisitor;
import enginescript.runtime.api.Export;
import enginescript.runtime.object.Variable;
import enginescript.runtime.proto.FunctionPrototype;
import enginescript.runtime.proto.TypePrototype;
import enginescript.runtime.proto.VariablePrototype;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static enginescript.EngineParser.EngineScript.*;

public class VMExecutor implements EngineScriptVisitor<Void> {

    final VM vm;
    // persistent variables
    public Scope currentScope;
    public Scope previousScope;
    Stack<Object> stack = new Stack<>();
    Token tracebackElement;
    boolean shouldBreak;

    public VMExecutor(VM vm) {
        this.vm = vm;
    }

    public void traceback(TerminalNode context) {

        this.tracebackElement = context.getSymbol();

    }

    public void traceback(ParserRuleContext context) {

        this.tracebackElement = context.start;

    }

    public void enterScope() {

        previousScope = currentScope;

        Scope scope = new Scope(vm);

        scope.parent = previousScope;

        currentScope = scope;

    }

    public void leaveScope() {

        currentScope = previousScope;

    }

    public Object eval(ExpressionContext expression) {

        expression.accept(this); // children of expressions should push a value to the stack

        return stack.pop(); // then we return the stack pushed value

    }

    public void callFunction(FunctionPrototype function) {

        enterScope(); // function upper

        function.scope = currentScope;

        for(VariablePrototype prototype : function.parameters) {

            Variable variable = currentScope.createVariable(prototype);
            variable.setValue(pop());

        }

        /**
         * there is an extra scope layer such that it is possible to overwrite the parameters using locals
         */

        function.block.accept(this);

        leaveScope();

    }

    public Variable resolveVariable(TerminalNode context) {

        String id = context.getText();

        Variable variable = (Variable) currentScope.resolveInstance(id);

        if(variable == null) {

            traceback(context); // place traceback to text element
            vm.error("Variable %s cannot be found", Codes.ERROR_VARIABLE_NOT_FOUND, id);
            return null;

        }

        return variable;

    }

    @SuppressWarnings("unchecked")
    public <T> T pop() {

        if(stack.empty())
            return null;

        return (T) stack.pop();

    }

    public <T> void push(T value) {

        stack.push(value);

    }

    public TerminalNode getToken(ParserRuleContext context, int i) {

        int j = -1;

        for (ParseTree o : context.children) {
            if (o instanceof TerminalNode) {
                TerminalNode tnode = (TerminalNode) o;
                j++;
                if (j == i) {
                    return tnode;
                }
            }
        }

        return null;

    }

    @Override
    public Void visitProgram(ProgramContext ctx) {

        vm.profiler.start("root");

        ctx.block().accept(this);

        vm.profiler.end();

        return null;
    }

    public void breakBlock() {

        shouldBreak = true;

    }

    @Override
    public Void visitBlock(BlockContext ctx) {

        vm.profiler.start("Block");

        List<StatementContext> statements = ctx.statement();

        enterScope();

        for (StatementContext statement : statements) {
            if(shouldBreak) {
                break;
            }
            statement.accept(this);
        }

        shouldBreak = false;

        leaveScope();

        vm.profiler.end();

        if (currentScope == null) { // no code to return to
            if (vm.HALT_ON_END)
                vm.halt(Codes.STATUS_SUCCESS); // stop execution
        }

        return null;
    }

    @Override
    public Void visitStatement(StatementContext ctx) {

        ParserRuleContext statement = (ParserRuleContext) ctx.getChild(0);

        vm.profiler.start(statement.getClass().getSimpleName());

        statement.accept(this);

        vm.profiler.end();

        return null;
    }

    @Override
    public Void visitComparisonExpression(ComparisonExpressionContext ctx) {

        ctx.expression(0).accept(this);
        ctx.expression(1).accept(this);

        Object left = pop();
        Object right = pop();

        String operation = ctx.comparisonOperator().getText();

        push(vm.math.compare(right, left, operation));

        return null;
    }

    @Override
    public Void visitBooleanExpression(BooleanExpressionContext ctx) {

        switch (ctx.BOOLLITERAL().getText()) {

            case "true":
                push(true);
            case "false":
                push(false);

        }

        return null;
    }

    public VariablePrototype create(String typeName, String varName) {

        VariablePrototype prototype = new VariablePrototype();

        prototype.typeName = typeName;
        prototype.id = varName;
        prototype.scope = currentScope;

        return prototype;

    }

    @Override
    public Void visitAssignExpression(AssignExpressionContext ctx) {

        traceback(ctx); // place traceback element

        List<TerminalNode> nodes = ctx.IDENTIFIER();

        ExpressionContext expression = ctx.expression();

        Variable variable;

        if (nodes.size() == 1) { // reassign

            variable = resolveVariable(nodes.get(0));

        } else {

            String typeName = nodes.get(0).getText();
            String varName = nodes.get(1).getText();

            variable = currentScope.createVariable(create(typeName, varName));

        }

        if (expression != null) {

            Object value = eval(expression);

            traceback(expression);
            variable.setValue(value);

        }


        return null;
    }

    @Override
    public Void visitMethodCallExpression(MethodCallExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitDecimalExpression(DecimalExpressionContext ctx) {

        float value = Float.parseFloat(ctx.DECIMALLITERAL().getText());

        if (value == (long) value) { // is an integer

            push((int) value);

        } else {

            push(value);

        }

        return null;
    }

    @Override
    public Void visitStringExpression(StringExpressionContext ctx) {

        String text = ctx.STRINGLITERAL().getText();

        text = text.substring(1);

        text = text.substring(0, text.length() - 1);

        push(text);
        return null;
    }

    @Override
    public Void visitIndexExpression(IndexExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitCallExpression(CallExpressionContext ctx) {

        TerminalNode node  = ctx.IDENTIFIER();

        FunctionPrototype function = (FunctionPrototype) currentScope.resolveProto(node.getText());

        CallParametersContext context = ctx.callParameters();

        if(function == null) {

            Export export = vm.defaultExports.get(node.getText());

            if(export != null && export.isMethod()) {

                // prepare callsite
                if(context != null)
                    context.accept(this);

                int paramSize = export.parameterSize();

                Object[] params = new Object[paramSize];

                // fill params with expressed values and ensure param buffer is right
                for (int i = 0; i < paramSize; i++) {
                    params[i] = pop();
                }

                try {
                    export.call(params);
                } catch (InvocationTargetException | IllegalAccessException e) {
                    traceback(node);
                    vm.error("Cannot call external function", Codes.ERROR_MODULE_EXTERNAL_ERROR);
                    e.printStackTrace();
                }

                return null;


            }

            traceback(node);
            vm.error("Can't resolve function: %s", Codes.ERROR_FUNCTION_NOT_FOUND, node.getText());

        } else {


            if(context != null)
             context.accept(this);

            callFunction(function);

        }

        return null;
    }

    @Override
    public Void visitArithmeticOrLogicalExpression(ArithmeticOrLogicalExpressionContext ctx) {

        ctx.expression(0).accept(this);
        ctx.expression(1).accept(this);

        Object left = pop();
        Object right = pop();

        String operation = getToken(ctx, 0).getText();

        traceback(getToken(ctx, 0));
        push(vm.math.op(right, left, operation));

        return null;
    }

    @Override
    public Void visitIdentifierExpression(IdentifierExpressionContext ctx) {

        push(resolveVariable(ctx.IDENTIFIER()).getValue());

        return null;
    }

    @Override
    public Void visitFieldExpression(FieldExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitExpressionStatement(ExpressionStatementContext ctx) {

        ExpressionContext expression = ctx.expression();

        vm.profiler.start(expression.getClass().getSimpleName());

        expression.accept(this);

        vm.profiler.end();

        return null;
    }

    @Override
    public Void visitReturnStatement(ReturnStatementContext ctx) {

        ExpressionContext context = ctx.expression();

        if(context != null)
            context.accept(this); // pushes return value to stack

        breakBlock();

        return null;
    }

    @Override
    public Void visitComparisonOperator(ComparisonOperatorContext ctx) {

        String child = ctx.getChild(0).getText();

        push(child);

        return null;
    }

    @Override
    public Void visitIfStatement(IfStatementContext ctx) {

        ctx.expression().accept(this);

        Object expression = pop();

        if(expression == null)
            return null;

        if(expression instanceof Boolean) {
            if ((Boolean) expression)
                ctx.block(0).accept(this);
        }else
            ctx.block(0).accept(this);

        return null;
    }

    @Override
    public Void visitParameterList(ParameterListContext ctx) {

        List<TerminalNode> nodes = ctx.IDENTIFIER();

        for (int i = 0; i < nodes.size(); i++) {
            String typeName = nodes.get(i).getText();
            String variableName = nodes.get(++i).getText();

            VariablePrototype prototype = create(typeName, variableName);

            push(prototype);

        }

        push(nodes.size() / 2); // push proper proto list size

        return null;
    }

    @Override
    public Void visitEntryParameterStatement(EntryParameterStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitEntryStatement(EntryStatementContext ctx) {

        ctx.block().accept(this);

        return null;
    }

    @Override
    public Void visitFunctionDeclartion(FunctionDeclartionContext ctx) {

        TerminalNode node = ctx.IDENTIFIER();

        TypePrototype proto = currentScope.resolveProto(node.getText());

        if(proto instanceof FunctionPrototype) {

            traceback(node);
            vm.error("Function %s is already defined", Codes.ERROR_FUNCTION_ALREADY_EXISTS, node.getText());

        }else {

            ctx.parameterList().accept(this); // read param list

            int paramSize = pop(); // stack will be [size, VariablePrototype, ...]

            List<VariablePrototype> prototypes = new ArrayList<>();

            for (int i = 0; i < paramSize; i++) {

                prototypes.add(pop()); // copy the stack elements

            }

            FunctionPrototype prototype = new FunctionPrototype();
            prototype.id = node.getText();
            prototype.parameters = prototypes;
            prototype.block = ctx.block();

            currentScope.registerPrototype(prototype); // register prototype


        }
        return null;
    }

    @Override
    public Void visitRequireStatement(RequireStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitCallParameters(CallParametersContext ctx) {
        vm.profiler.start("CallParametersContext");

        for(ExpressionContext context : ctx.expression())
            context.accept(this); // evaluate parameters

        vm.profiler.end();

        return null;
    }

    @Override
    public Void visitStructureStatement(StructureStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitClassStatement(ClassStatementContext ctx) {
        return null;
    }

    @Override
    public Void visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Void visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Void visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Void visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}

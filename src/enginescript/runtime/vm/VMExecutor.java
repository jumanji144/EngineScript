package enginescript.runtime.vm;

import enginescript.EngineParser.EngineScriptVisitor;
import enginescript.runtime.object.Variable;
import enginescript.runtime.proto.VariablePrototype;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

import static enginescript.EngineParser.EngineScript.*;

public class VMExecutor implements EngineScriptVisitor<Void> {

    final VM vm;
    // persistent variables
    public Scope currentScope;
    public Scope previousScope;
    Queue<Object> stack = new ArrayDeque<>();
    Token tracebackElement;
    public VMExecutor(VM vm) {
        this.vm = vm;
    }

    public void traceback(TerminalNode context) {

        this.tracebackElement = context.getSymbol();

    }

    public void traceback(ParserRuleContext context) {

        this.tracebackElement = context.start;

    }

    public Object eval(ExpressionContext expression) {

        expression.accept(this); // children of expressions should push a value to the stack

        return stack.poll(); // then we return the stack pushed value

    }

    @SuppressWarnings("unchecked")
    public <T> T pullFromStack() {

        return (T) stack.poll();

    }

    public <T> void pushToStack(T value) {

        stack.add(value);

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

        ctx.block().accept(this);

        return null;
    }

    @Override
    public Void visitBlock(BlockContext ctx) {

        Scope blockScope = new Scope(vm);

        List<StatementContext> statements = ctx.statement();

        previousScope = currentScope;

        currentScope = blockScope;

        currentScope.parent = previousScope;

        statements.forEach(statement -> statement.accept(this)); // execute block code

        previousScope = currentScope.parent;


        if (previousScope == null) { // no code to return to
            if (vm.HALT_ON_END)
                vm.halt(Codes.STATUS_SUCCESS); // stop execution
        } else
            currentScope = previousScope; // return to previous scope

        return null;
    }

    @Override
    public Void visitStatement(StatementContext ctx) {

        ctx.getChild(0).accept(this);

        return null;
    }

    @Override
    public Void visitComparisonExpression(ComparisonExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitAssignExpression(AssignExpressionContext ctx) {

        traceback(ctx); // place traceback element

        List<TerminalNode> nodes = ctx.IDENTIFIER();

        ExpressionContext expression = ctx.expression();

        Variable variable;

        if (nodes.size() == 1) { // reassign

            String varName = nodes.get(0).getText();

            variable = (Variable) currentScope.resolveInstance(varName);

            if (variable == null) {

                traceback(nodes.get(0)); // place traceback to text element
                vm.error("Variable %s cannot be found", Codes.ERROR_VARIABLE_NOT_FOUND, varName);
                return null;

            }

        } else {

            String typeName = nodes.get(0).getText();
            String varName = nodes.get(1).getText();

            VariablePrototype prototype = new VariablePrototype();

            prototype.typeName = typeName;
            prototype.id = varName;
            prototype.scope = currentScope;

            variable = currentScope.createVariable(prototype);

        }

        if (expression != null) {

            Object value = eval(expression);

            traceback(expression);
            variable.setValue(value);

        }


        return null;
    }

    @Override
    public Void visitArithmeticBracketExpression(ArithmeticBracketExpressionContext ctx) {
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

            pushToStack((int) value);

        } else {

            pushToStack(value);

        }

        return null;
    }

    @Override
    public Void visitStringExpression(StringExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitIndexExpression(IndexExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitCallExpression(CallExpressionContext ctx) {

        String functionName = ctx.IDENTIFIER().getText();

        return null;
    }

    @Override
    public Void visitArithmeticOrLogicalExpression(ArithmeticOrLogicalExpressionContext ctx) {

        ctx.expression(0).accept(this);
        ctx.expression(1).accept(this);

        Object left = pullFromStack();
        Object right = pullFromStack();

        String operation = getToken(ctx, 0).getText();

        pushToStack(vm.math.op(left, right, operation));

        return null;
    }

    @Override
    public Void visitIdentifierExpression(IdentifierExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitFieldExpression(FieldExpressionContext ctx) {
        return null;
    }

    @Override
    public Void visitExpressionStatement(ExpressionStatementContext ctx) {

        ctx.expression().accept(this);

        return null;
    }

    @Override
    public Void visitReturnStatement(ReturnStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitComparisonOperator(ComparisonOperatorContext ctx) {
        return null;
    }

    @Override
    public Void visitIfStatement(IfStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitParameterList(ParameterListContext ctx) {
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
        return null;
    }

    @Override
    public Void visitRequireStatement(RequireStatementContext ctx) {
        return null;
    }

    @Override
    public Void visitCallParameters(CallParametersContext ctx) {

        List<ExpressionContext> contextes = ctx.expression();

        pushToStack(contextes.size());

        for(ExpressionContext context : contextes)
            context.accept(this); // evaluate parameters

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

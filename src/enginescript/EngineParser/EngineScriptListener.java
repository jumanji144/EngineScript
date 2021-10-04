// Generated from D:/Projects/IntelJProjects/Antlr/src/enginescript\EngineScript.g4 by ANTLR 4.9.1
package enginescript.EngineParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EngineScript}.
 */
public interface EngineScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EngineScript#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EngineScript.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EngineScript.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EngineScript.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EngineScript.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EngineScript.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EngineScript.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(EngineScript.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(EngineScript.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(EngineScript.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(EngineScript.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticBracketExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBracketExpression(EngineScript.ArithmeticBracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticBracketExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBracketExpression(EngineScript.ArithmeticBracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(EngineScript.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(EngineScript.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalExpression(EngineScript.DecimalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalExpression(EngineScript.DecimalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(EngineScript.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(EngineScript.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpression(EngineScript.IndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpression(EngineScript.IndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(EngineScript.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(EngineScript.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticOrLogicalExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOrLogicalExpression(EngineScript.ArithmeticOrLogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticOrLogicalExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOrLogicalExpression(EngineScript.ArithmeticOrLogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(EngineScript.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(EngineScript.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldExpression(EngineScript.FieldExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldExpression(EngineScript.FieldExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(EngineScript.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(EngineScript.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(EngineScript.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(EngineScript.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(EngineScript.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(EngineScript.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(EngineScript.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(EngineScript.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(EngineScript.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(EngineScript.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#entryParameterStatement}.
	 * @param ctx the parse tree
	 */
	void enterEntryParameterStatement(EngineScript.EntryParameterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#entryParameterStatement}.
	 * @param ctx the parse tree
	 */
	void exitEntryParameterStatement(EngineScript.EntryParameterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#entryStatement}.
	 * @param ctx the parse tree
	 */
	void enterEntryStatement(EngineScript.EntryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#entryStatement}.
	 * @param ctx the parse tree
	 */
	void exitEntryStatement(EngineScript.EntryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclartion(EngineScript.FunctionDeclartionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#functionDeclartion}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclartion(EngineScript.FunctionDeclartionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#requireStatement}.
	 * @param ctx the parse tree
	 */
	void enterRequireStatement(EngineScript.RequireStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#requireStatement}.
	 * @param ctx the parse tree
	 */
	void exitRequireStatement(EngineScript.RequireStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#callParameters}.
	 * @param ctx the parse tree
	 */
	void enterCallParameters(EngineScript.CallParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#callParameters}.
	 * @param ctx the parse tree
	 */
	void exitCallParameters(EngineScript.CallParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#structureStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructureStatement(EngineScript.StructureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#structureStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructureStatement(EngineScript.StructureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EngineScript#classStatement}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(EngineScript.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EngineScript#classStatement}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(EngineScript.ClassStatementContext ctx);
}
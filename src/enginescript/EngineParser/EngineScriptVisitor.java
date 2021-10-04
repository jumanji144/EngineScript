// Generated from D:/Projects/IntelJProjects/Antlr/src/enginescript\EngineScript.g4 by ANTLR 4.9.1
package enginescript.EngineParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EngineScript}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EngineScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EngineScript#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EngineScript.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EngineScript.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EngineScript.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(EngineScript.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(EngineScript.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticBracketExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBracketExpression(EngineScript.ArithmeticBracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCallExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(EngineScript.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalExpression(EngineScript.DecimalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(EngineScript.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpression(EngineScript.IndexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpression(EngineScript.CallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticOrLogicalExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOrLogicalExpression(EngineScript.ArithmeticOrLogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(EngineScript.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldExpression}
	 * labeled alternative in {@link EngineScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExpression(EngineScript.FieldExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(EngineScript.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(EngineScript.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(EngineScript.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(EngineScript.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(EngineScript.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#entryParameterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryParameterStatement(EngineScript.EntryParameterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#entryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryStatement(EngineScript.EntryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#functionDeclartion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclartion(EngineScript.FunctionDeclartionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#requireStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequireStatement(EngineScript.RequireStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#callParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameters(EngineScript.CallParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#structureStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureStatement(EngineScript.StructureStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EngineScript#classStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassStatement(EngineScript.ClassStatementContext ctx);
}
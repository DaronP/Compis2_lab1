// Generated from yapl.g4 by ANTLR 4.10
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link yaplParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface yaplVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link yaplParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(yaplParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#declarationBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationBlock(yaplParser.DeclarationBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(yaplParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(yaplParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(yaplParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(yaplParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(yaplParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(yaplParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(yaplParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(yaplParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(yaplParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(yaplParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(yaplParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(yaplParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(yaplParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(yaplParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(yaplParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(yaplParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreationExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreationExpr(yaplParser.CreationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(yaplParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityComparison(yaplParser.EqualityComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(yaplParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(yaplParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(yaplParser.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#fullIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullIdentifier(yaplParser.FullIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(yaplParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(yaplParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(yaplParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(yaplParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link yaplParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(yaplParser.LiteralContext ctx);
}
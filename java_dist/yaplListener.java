// Generated from yapl.g4 by ANTLR 4.10
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yaplParser}.
 */
public interface yaplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yaplParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(yaplParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(yaplParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationBlock(yaplParser.DeclarationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#declarationBlock}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationBlock(yaplParser.DeclarationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(yaplParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(yaplParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(yaplParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(yaplParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(yaplParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(yaplParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(yaplParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(yaplParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(yaplParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(yaplParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(yaplParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(yaplParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(yaplParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(yaplParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(yaplParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(yaplParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(yaplParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(yaplParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(yaplParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(yaplParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(yaplParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(yaplParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(yaplParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(yaplParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(yaplParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(yaplParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(yaplParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(yaplParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(yaplParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(yaplParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(yaplParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparison}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(yaplParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreationExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCreationExpr(yaplParser.CreationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreationExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCreationExpr(yaplParser.CreationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(yaplParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(yaplParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(yaplParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(yaplParser.EqualityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(yaplParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link yaplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(yaplParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(yaplParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(yaplParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(yaplParser.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(yaplParser.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFullIdentifier(yaplParser.FullIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#fullIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFullIdentifier(yaplParser.FullIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(yaplParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(yaplParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(yaplParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(yaplParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(yaplParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(yaplParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(yaplParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(yaplParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(yaplParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(yaplParser.LiteralContext ctx);
}
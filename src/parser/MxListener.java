// Generated from .\Mx.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(MxParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(MxParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code New}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(MxParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(MxParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPre}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPre(MxParser.UnaryPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPre}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPre(MxParser.UnaryPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPos}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPos(MxParser.UnaryPosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPos}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPos(MxParser.UnaryPosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(MxParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(MxParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConst(MxParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConst(MxParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code This}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThis(MxParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code This}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThis(MxParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndex(MxParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndex(MxParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary(MxParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary(MxParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Member}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMember(MxParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Member}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMember(MxParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionParam}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParam(MxParser.FunctionParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionParam}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParam(MxParser.FunctionParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#var_multi_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_multi_def(MxParser.Var_multi_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#var_multi_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_multi_def(MxParser.Var_multi_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#var_def_and_init}.
	 * @param ctx the parse tree
	 */
	void enterVar_def_and_init(MxParser.Var_def_and_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#var_def_and_init}.
	 * @param ctx the parse tree
	 */
	void exitVar_def_and_init(MxParser.Var_def_and_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(MxParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(MxParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#var_malloc}.
	 * @param ctx the parse tree
	 */
	void enterVar_malloc(MxParser.Var_mallocContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#var_malloc}.
	 * @param ctx the parse tree
	 */
	void exitVar_malloc(MxParser.Var_mallocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VardefStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVardefStatement(MxParser.VardefStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VardefStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVardefStatement(MxParser.VardefStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statements}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MxParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statements}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MxParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MxParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MxParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MxParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MxParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MxParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MxParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MxParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MxParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MxParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MxParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MxParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MxParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(MxParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(MxParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#program_part}.
	 * @param ctx the parse tree
	 */
	void enterProgram_part(MxParser.Program_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#program_part}.
	 * @param ctx the parse tree
	 */
	void exitProgram_part(MxParser.Program_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(MxParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(MxParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MxParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MxParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(MxParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(MxParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(MxParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(MxParser.Func_defContext ctx);
}
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
	 * Enter a parse tree produced by {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MxParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MxParser.StatementContext ctx);
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
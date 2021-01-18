// Generated from .\Mx.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(MxParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#var_multi_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_multi_def(MxParser.Var_multi_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#var_def_and_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def_and_init(MxParser.Var_def_and_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(MxParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#var_malloc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_malloc(MxParser.Var_mallocContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#program_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_part(MxParser.Program_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(MxParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MxParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(MxParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(MxParser.Func_defContext ctx);
}
package frontend;

import AST.AST;
import parser.MxBaseVisitor;
import parser.MxParser;

public class ASTBuilder extends MxBaseVisitor<AST>
{
    public ASTBuilder()
    {

    }

    @Override
    public AST visitExpression_list(MxParser.Expression_listContext ctx)
    {
        return super.visitExpression_list(ctx);
    }

    @Override
    public AST visitExpression(MxParser.ExpressionContext ctx)
    {
        return super.visitExpression(ctx);
    }

    @Override
    public AST visitVar_multi_def(MxParser.Var_multi_defContext ctx)
    {
        return super.visitVar_multi_def(ctx);
    }

    @Override
    public AST visitVar_def_and_init(MxParser.Var_def_and_initContext ctx)
    {
        return super.visitVar_def_and_init(ctx);
    }

    @Override
    public AST visitVar_def(MxParser.Var_defContext ctx)
    {
        return super.visitVar_def(ctx);
    }

    @Override
    public AST visitVar_malloc(MxParser.Var_mallocContext ctx)
    {
        return super.visitVar_malloc(ctx);
    }

    @Override
    public AST visitStatement(MxParser.StatementContext ctx)
    {
        return super.visitStatement(ctx);
    }

    @Override
    public AST visitProgram(MxParser.ProgramContext ctx)
    {
        return super.visitProgram(ctx);
    }

    @Override
    public AST visitProgram_part(MxParser.Program_partContext ctx)
    {
        return super.visitProgram_part(ctx);
    }

    @Override
    public AST visitType(MxParser.TypeContext ctx)
    {
        return super.visitType(ctx);
    }

    @Override
    public AST visitClass_def(MxParser.Class_defContext ctx)
    {
        return super.visitClass_def(ctx);
    }

    @Override
    public AST visitParam(MxParser.ParamContext ctx)
    {
        return super.visitParam(ctx);
    }

    @Override
    public AST visitParamlist(MxParser.ParamlistContext ctx)
    {
        return super.visitParamlist(ctx);
    }

    @Override
    public AST visitFunc_def(MxParser.Func_defContext ctx)
    {
        return super.visitFunc_def(ctx);
    }
}

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
    public AST visitNew(MxParser.NewContext ctx)
    {
        return super.visitNew(ctx);
    }

    @Override
    public AST visitUnaryPre(MxParser.UnaryPreContext ctx)
    {
        return super.visitUnaryPre(ctx);
    }

    @Override
    public AST visitUnaryPos(MxParser.UnaryPosContext ctx)
    {
        return super.visitUnaryPos(ctx);
    }

    @Override
    public AST visitIdentifierExpr(MxParser.IdentifierExprContext ctx)
    {
        return super.visitIdentifierExpr(ctx);
    }

    @Override
    public AST visitConst(MxParser.ConstContext ctx)
    {
        return super.visitConst(ctx);
    }

    @Override
    public AST visitThis(MxParser.ThisContext ctx)
    {
        return super.visitThis(ctx);
    }

    @Override
    public AST visitIndex(MxParser.IndexContext ctx)
    {
        return super.visitIndex(ctx);
    }

    @Override
    public AST visitBinary(MxParser.BinaryContext ctx)
    {
        return super.visitBinary(ctx);
    }

    @Override
    public AST visitMember(MxParser.MemberContext ctx)
    {
        return super.visitMember(ctx);
    }

    @Override
    public AST visitFunctionParam(MxParser.FunctionParamContext ctx)
    {
        return super.visitFunctionParam(ctx);
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
    public AST visitVardefStatement(MxParser.VardefStatementContext ctx)
    {
        return super.visitVardefStatement(ctx);
    }

    @Override
    public AST visitStatements(MxParser.StatementsContext ctx)
    {
        return super.visitStatements(ctx);
    }

    @Override
    public AST visitIfStatement(MxParser.IfStatementContext ctx)
    {
        return super.visitIfStatement(ctx);
    }

    @Override
    public AST visitForStatement(MxParser.ForStatementContext ctx)
    {
        return super.visitForStatement(ctx);
    }

    @Override
    public AST visitWhileStatement(MxParser.WhileStatementContext ctx)
    {
        return super.visitWhileStatement(ctx);
    }

    @Override
    public AST visitReturnStatement(MxParser.ReturnStatementContext ctx)
    {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public AST visitBreakStatement(MxParser.BreakStatementContext ctx)
    {
        return super.visitBreakStatement(ctx);
    }

    @Override
    public AST visitContinueStatement(MxParser.ContinueStatementContext ctx)
    {
        return super.visitContinueStatement(ctx);
    }

    @Override
    public AST visitExprStatement(MxParser.ExprStatementContext ctx)
    {
        return super.visitExprStatement(ctx);
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

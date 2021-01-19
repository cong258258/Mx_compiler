package frontend;

import AST.*;
import org.antlr.v4.runtime.ParserRuleContext;
import parser.MxBaseVisitor;
import parser.MxParser;
import utility.Position;
import java.util.ArrayList;

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
        Position tmp_pos = new Position(ctx);
        Optype tmp_op;
        if(ctx.ADD_OP() != null)
            tmp_op = Optype.op_zheng;
        else if(ctx.MINUS_OP() != null)
            tmp_op = Optype.op_fu;
        else if(ctx.ZIZENG_OP() != null)
            tmp_op = Optype.op_zizeng;
        else if(ctx.ZIJIAN_OP() != null)
            tmp_op = Optype.op_zijian;
        else if(ctx.NOT_OP() != null)
            tmp_op = Optype.op_not;
        else if(ctx.LOGIC_NOT_OP() != null)
            tmp_op = Optype.op_logic_not;
        else
        {
            tmp_op = Optype.op_empty;
            System.out.println("visitUnaryPre??????");
        }
        ExprAST tmp_expr = (ExprAST) visit(ctx.expression());
        return new UnaryPreAST(tmp_pos, tmp_op, tmp_expr);
    }

    @Override
    public AST visitUnaryPos(MxParser.UnaryPosContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        Optype tmp_op;
        if(ctx.ZIZENG_OP() != null)
            tmp_op = Optype.op_zizeng;
        else if(ctx.ZIJIAN_OP() != null)
            tmp_op = Optype.op_zijian;
        else
        {
            tmp_op = Optype.op_empty;
            System.out.println("visitUnaryPos??????");
        }
        ExprAST tmp_expr = (ExprAST) visit(ctx.expression());
        return new UnaryPosAST(tmp_pos, tmp_op, tmp_expr);
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
        Position tmp_pos = new Position(ctx);
        ExprAST tmp_condition = (ExprAST) visit(ctx.expression());
        StatementAST tmp_todo_statement = (StatementAST) visit(ctx.statement(0));
        StatementAST tmp_else_statement;
        if(ctx.statement(1) != null)
            tmp_else_statement = (StatementAST) visit(ctx.statement(1));
        else
            tmp_else_statement = null;
        return new IfStatementAST(tmp_pos, tmp_condition, tmp_todo_statement, tmp_else_statement);
    }

    @Override
    public AST visitForStatement(MxParser.ForStatementContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        StatementAST tmp_init;
        if(ctx.statement(0) != null)
            tmp_init = (StatementAST) visit(ctx.statement(0));
        else
            tmp_init = null;
        ExprAST tmp_condition;
        if(ctx.expression() != null)
            tmp_condition = (ExprAST) visit(ctx.expression());
        else
            tmp_condition = null;
        StatementAST tmp_update;
        if(ctx.statement(1) != null)
            tmp_update = (StatementAST) visit(ctx.statement(1));
        else
            tmp_update = null;
        StatementAST tmp_todo_statement = (StatementAST) visit(ctx.statement(2));
        return new ForStatementAST(tmp_pos, tmp_init, tmp_condition, tmp_update, tmp_todo_statement);
    }

    @Override
    public AST visitWhileStatement(MxParser.WhileStatementContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ExprAST tmp_condition = (ExprAST) visit(ctx.expression());
        StatementAST tmp_todo_statement = (StatementAST) visit(ctx.statement());
        return new WhileStatementAST(tmp_pos, tmp_condition, tmp_todo_statement);
    }

    @Override
    public AST visitReturnStatement(MxParser.ReturnStatementContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ExprAST tmp_return_expr;
        if(ctx.expression() != null)
            tmp_return_expr = (ExprAST) visit(ctx.expression());
        else
            tmp_return_expr = null;
        return new ReturnStatementAST(tmp_pos, tmp_return_expr);
    }

    @Override
    public AST visitBreakStatement(MxParser.BreakStatementContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        return new BreakStatementAST(tmp_pos);
    }

    @Override
    public AST visitContinueStatement(MxParser.ContinueStatementContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        return new ContinueStatementAST(tmp_pos);
    }

    @Override
    public AST visitExprStatement(MxParser.ExprStatementContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ExprAST tmp_expr = (ExprAST) visit(ctx.expression());
        return new ExprStatementAST(tmp_pos, tmp_expr);
    }

    @Override
    public AST visitProgram(MxParser.ProgramContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ArrayList<ProgramPartAST> tmp_program_parts = new ArrayList<ProgramPartAST>();
        for(ParserRuleContext i: ctx.program_part())
            tmp_program_parts.add((ProgramPartAST) visit(i));
        return new ProgramAST(tmp_pos, tmp_program_parts);
    }

    @Override
    public AST visitProgram_part(MxParser.Program_partContext ctx)
    {
        if(ctx.class_def() != null)
            return visit(ctx.class_def());
        else if(ctx.func_def() != null)
            return visit(ctx.func_def());
        else if(ctx.var_def() != null)
            return visit(ctx.var_def());
        else
        {
            System.out.println("visitProgram_part?????");
            return null;
        }
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

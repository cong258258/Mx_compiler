package frontend;

import AST.*;
import org.antlr.v4.runtime.ParserRuleContext;
import parser.MxBaseVisitor;
import parser.MxParser;
import utility.Position;
import java.util.ArrayList;
import static java.lang.Integer.parseInt;

public class ASTBuilder extends MxBaseVisitor<AST>
{
    public ASTBuilder()
    {

    }

    @Override
    public AST visitConstant(MxParser.ConstantContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        String tmp_val = ctx.getText();
        System.out.println("!!!!!test getText" + tmp_val);
        if(ctx.BOOL_CONST() != null)
        {
            if(tmp_val.equals("true"))
                return new ConstBoolAST(tmp_pos, true);
            else
                return new ConstBoolAST(tmp_pos, false);
        }
        else if(ctx.NULL_CONST() != null)
            return new ConstNullAST(tmp_pos);
        else if(ctx.STRING_CONST() != null)
            return new ConstStringAST(tmp_pos, tmp_val);
        else if(ctx.INT_CONST() != null)
            return new ConstIntAST(tmp_pos, parseInt(tmp_val));
        else
        {
            System.out.println("visitConstant?????");
            return null;
        }
    }

    @Override
    public AST visitExpression_list(MxParser.Expression_listContext ctx)
    {
        return null;
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
        return visit(ctx.constant());
    }

    @Override
    public AST visitThis(MxParser.ThisContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        return new ThisAST(tmp_pos);
    }

    @Override
    public AST visitIndex(MxParser.IndexContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ExprAST tmp_mainExprAST = (ExprAST) visit(ctx.expression(0));
        ExprAST tmp_indexExprAST = (ExprAST) visit(ctx.expression(1));
        return new IndexAST(tmp_pos, tmp_mainExprAST, tmp_indexExprAST);
    }

    @Override
    public AST visitBinary(MxParser.BinaryContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        Optype tmp_op;
        if(ctx.ADD_OP() != null)
            tmp_op = Optype.op_add;
        else if(ctx.MINUS_OP() != null)
            tmp_op = Optype.op_minus;
        else if(ctx.MULTI_OP() != null)
            tmp_op = Optype.op_multi;
        else if(ctx.DIV_OP() != null)
            tmp_op = Optype.op_divide;
        else if(ctx.MOD_OP() != null)
            tmp_op = Optype.op_mod;
        else if(ctx.LEFT_SHIFT_OP() != null)
            tmp_op = Optype.op_left_shift;
        else if(ctx.RIGHT_SHIFT_OP() != null)
            tmp_op = Optype.op_right_shift;
        else if(ctx.XIAOYU_OP() != null)
            tmp_op = Optype.op_xiaoyu;
        else if(ctx.XIAOYUDENGYU_OP() != null)
            tmp_op = Optype.op_xiaoyudengyu;
        else if(ctx.DAYU_OP() != null)
            tmp_op = Optype.op_dayu;
        else if(ctx.DAYUDENGYU_OP() != null)
            tmp_op = Optype.op_dayudengyu;
        else if(ctx.EQUAL_OP() != null)
            tmp_op = Optype.op_equal;
        else if(ctx.NOT_EQUAL_OP() != null)
            tmp_op = Optype.op_not_equal;
        else if(ctx.AND_OP() != null)
            tmp_op = Optype.op_and;
        else if(ctx.OR_OP() != null)
            tmp_op = Optype.op_or;
        else if(ctx.XOR_OP() != null)
            tmp_op = Optype.op_xor;
        else if(ctx.LOGIC_AND_OP() != null)
            tmp_op = Optype.op_logic_and;
        else if(ctx.LOGIC_OR_OP() != null)
            tmp_op = Optype.op_logic_or;
        else if(ctx.ASSIGN() != null)
            tmp_op = Optype.op_assign;
        else
        {
            tmp_op = Optype.op_empty;
            System.out.println("visitBinary??????");
        }
        ExprAST tmp_lhs = (ExprAST) visit(ctx.expression(0));
        ExprAST tmp_rhs = (ExprAST) visit(ctx.expression(1));
        return new BinaryAST(tmp_pos, tmp_op, tmp_lhs, tmp_rhs);
    }

    @Override
    public AST visitMember(MxParser.MemberContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ExprAST tmp_exprAST = (ExprAST) visit(ctx.expression());
        IdentifierExprAST tmp_identifierExprAST = (IdentifierExprAST) visit(ctx.IDENTIFIER());
        return new MemberAST(tmp_pos, tmp_exprAST, tmp_identifierExprAST);
    }

    @Override
    public AST visitFunctionParam(MxParser.FunctionParamContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ExprAST tmp_function_name = (ExprAST) visit(ctx.expression());
        ArrayList<ExprAST> tmp_params = new ArrayList<>();
        if(ctx.expression_list() != null)
            for(ParserRuleContext i : ctx.expression_list().expression())
                tmp_params.add((ExprAST) visit(i));
        return new FunctionParamAST(tmp_pos, tmp_function_name, tmp_params);
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
        Position tmp_pos = new Position(ctx);
        ArrayList<StatementAST> tmp_statements = new ArrayList<>();
        for(ParserRuleContext i: ctx.statement())
            tmp_statements.add((StatementAST) visit(i));
        return new StatementsAST(tmp_pos, tmp_statements);
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
        ArrayList<ProgramPartAST> tmp_program_parts = new ArrayList<>();
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
        Position tmp_pos = new Position(ctx);
        String tmp_identifier = ctx.IDENTIFIER().getText();
        ArrayList<VarmultidefStatementAST> tmp_members = new ArrayList<>();
//        for(ParserRuleContext i: ctx.var_def())
        return null;
    }

    @Override
    public AST visitParam(MxParser.ParamContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        TypeAST tmp_param_type = (TypeAST) visit(ctx.type());
        String tmp_param_name = ctx.IDENTIFIER().getText();
        return new ParamAST(tmp_pos, tmp_param_type, tmp_param_name);
    }

    @Override
    public AST visitParamlist(MxParser.ParamlistContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ArrayList<ParamAST> tmp_param_name_list = new ArrayList<>();
        for(ParserRuleContext i: ctx.param())
            tmp_param_name_list.add((ParamAST) visit(i));
        return new ParamlistAST(tmp_pos, tmp_param_name_list);
    }

    @Override
    public AST visitFunc_def(MxParser.Func_defContext ctx)
    {
        TypeAST tmp_return_vartype = (TypeAST) visit(ctx.type());
        
        return super.visitFunc_def(ctx);
    }
}

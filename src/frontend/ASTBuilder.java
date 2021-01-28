package frontend;

import AST.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
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
//        System.out.println("!!!!!test getText" + tmp_val);
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
        return visit(ctx.var_malloc());
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
        Position tmp_pos = new Position(ctx);
        String tmp_name = ctx.IDENTIFIER().getText();
        return new IdentifierExprAST(tmp_pos, tmp_name);
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
        String tmp_member_identifier = ctx.IDENTIFIER().getText();
        return new MemberAST(tmp_pos, tmp_exprAST, tmp_member_identifier);
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
        Position tmp_pos = new Position(ctx);
        TypeAST tmp_vartype = (TypeAST) visit(ctx.type());
        ArrayList<String> tmp_identifiers = new ArrayList<>();
        for(TerminalNode i: ctx.IDENTIFIER())
            tmp_identifiers.add(i.getText());
        return new VarmultidefStatementAST(tmp_pos, tmp_vartype, tmp_identifiers);
    }

    @Override
    public AST visitVar_def_and_init(MxParser.Var_def_and_initContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        TypeAST tmp_vartype = (TypeAST) visit(ctx.type());
        String tmp_identifier = ctx.IDENTIFIER().getText();
        ExprAST tmp_init_expr = (ExprAST) visit(ctx.expression());
        return new VardefandinitStatementAST(tmp_pos, tmp_vartype, tmp_identifier, tmp_init_expr);
    }

    @Override
    public AST visitVar_def(MxParser.Var_defContext ctx)
    {
        if(ctx.var_def_and_init() != null)
            return visit(ctx.var_def_and_init());
        else if(ctx.var_multi_def() != null)
            return visit(ctx.var_multi_def());
        else
        {
            System.out.println("visitVar_def?????");
            return null;
        }
    }

    @Override
    public AST visitVar_malloc(MxParser.Var_mallocContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        TypeAST tmp_vartype = (TypeAST) visit(ctx.type());
        int tmp_dimension_all = ctx.LEFT_BRACKET().size();
        int tmp_dimension_with_init = ctx.expression().size();
//        System.out.println("!!!dimension all:" + tmp_dimension_all + " dimension init:" +tmp_dimension_with_init);
        ArrayList<ExprAST> tmp_init_expr;
        if(tmp_dimension_with_init == 0)
            tmp_init_expr = null;
        else
        {
            tmp_init_expr = new ArrayList<>();
            for (ParserRuleContext i: ctx.expression())
                tmp_init_expr.add((ExprAST) visit(i));
        }
        return new NewAST(tmp_pos, tmp_vartype, tmp_init_expr, tmp_dimension_all);
    }

    @Override
    public AST visitVardefStatement(MxParser.VardefStatementContext ctx)
    {
        return visit(ctx.var_def());
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
        ExprAST tmp_init;
        if(ctx.expression(0) != null)
            tmp_init = (ExprAST) visit(ctx.expression(0));
        else
            tmp_init = null;
        ExprAST tmp_condition;
        if(ctx.expression(1) != null)
            tmp_condition = (ExprAST) visit(ctx.expression(1));
        else
            tmp_condition = null;
        ExprAST tmp_update;
        if(ctx.expression(2) != null)
            tmp_update = (ExprAST) visit(ctx.expression(2));
        else
            tmp_update = null;
        StatementAST tmp_todo_statement = (StatementAST) visit(ctx.statement());
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
        {
            AST ASTi = visit(i);
            tmp_program_parts.add((ProgramPartAST) ASTi);
//            System.out.println("visitProgram, read func or class or globalvardef");
        }
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
        {
            Position tmp_pos = new Position(ctx);
            return new GlobalVardefAST(tmp_pos, (VardefStatementAST) visit(ctx.var_def()));
        }
        else
        {
            System.out.println("visitProgram_part?????");
            return null;
        }
    }

    @Override
    public AST visitType(MxParser.TypeContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        if(ctx.LEFT_BRACKET() == null)
        {
            String tmp_typename;
            if(ctx.BOOL() != null)
                tmp_typename = "bool";
            else if(ctx.INT() != null)
                tmp_typename = "int";
            else if(ctx.STRING() != null)
                tmp_typename = "String";
            else if(ctx.IDENTIFIER() != null)
                tmp_typename = ctx.IDENTIFIER().getText();
            else
                tmp_typename = "void";
            return new SingleTypeAST(tmp_pos, tmp_typename);
        }
        else
        {
            int tmp_dimension = 0;
            MxParser.TypeContext newctx = ctx;
            while(true)
            {
                tmp_dimension++;
                newctx = newctx.type();
                if(newctx.LEFT_BRACKET() == null)
                    break;
            }
            String tmp_typename;
            if(newctx.BOOL() != null)
                tmp_typename = "bool";
            else if(newctx.INT() != null)
                tmp_typename = "int";
            else if(newctx.STRING() != null)
                tmp_typename = "String";
            else if(newctx.IDENTIFIER() != null)
                tmp_typename = newctx.getText();
            else
            {
                tmp_typename = "void";
//                System.out.println("????void[]");
            }
            return new ArrayTypeAST(tmp_pos, tmp_typename, tmp_dimension);
        }
    }

    @Override
    public AST visitClass_def(MxParser.Class_defContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        String tmp_identifier = ctx.IDENTIFIER().getText();
        ArrayList<VardefStatementAST> tmp_members = new ArrayList<>();
        for(ParserRuleContext i: ctx.var_def())
            tmp_members.add((VardefStatementAST) visit(i));
        ArrayList<FunctiondefAST> tmp_functions = new ArrayList<>();
        FunctiondefAST tmp_constructor = null;
        for(int i = 0; i < ctx.func_def().size(); i++)
        {
            if(ctx.func_def(i).type() == null)
            {
                System.out.println("Class Constructor");
                tmp_constructor = (FunctiondefAST) visit(ctx.func_def(i));
            }
            else
                tmp_functions.add((FunctiondefAST) visit(ctx.func_def(i)));
        }
        return new ClassdefAST(tmp_pos, tmp_identifier, tmp_members, tmp_functions, tmp_constructor);
    }

    @Override
    public AST visitParam(MxParser.ParamContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        TypeAST tmp_param_type = (TypeAST) visit(ctx.type());
        String tmp_param_name = ctx.IDENTIFIER().getText();
        return new VarAST(tmp_pos, tmp_param_type, tmp_param_name);
    }

    @Override
    public AST visitParamlist(MxParser.ParamlistContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        ArrayList<VarAST> tmp_param_name_list = new ArrayList<>();
        for(ParserRuleContext i: ctx.param())
            tmp_param_name_list.add((VarAST) visit(i));
        return new VarlistAST(tmp_pos, tmp_param_name_list);
    }

    @Override
    public AST visitFunc_def(MxParser.Func_defContext ctx)
    {
        Position tmp_pos = new Position(ctx);
        TypeAST tmp_return_vartype;
        if(ctx.type() != null)
            tmp_return_vartype = (TypeAST) visit(ctx.type());
        else
            tmp_return_vartype = new SingleTypeAST(tmp_pos, "void");
        String tmp_function_name = ctx.IDENTIFIER().getText();
        VarlistAST tmp_params;
        if(ctx.paramlist() == null)
            tmp_params = null;
        else
            tmp_params = (VarlistAST) visit(ctx.paramlist());
        StatementAST tmp_statements = (StatementAST) visit(ctx.statement());
        return new FunctiondefAST(tmp_pos, tmp_return_vartype, tmp_function_name, tmp_params, tmp_statements);
    }

    @Override
    public AST visitSub(MxParser.SubContext ctx)
    {
        return visit(ctx.expression());
    }

    @Override
    public AST visitEmptyStatememt(MxParser.EmptyStatememtContext ctx)
    {
        return null;
    }
}

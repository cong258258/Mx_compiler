package IR;

import AST.*;
import IR.instruction.*;
import IR.operand.*;
import utility.*;
import static IR.instruction.IROptype.*;
import static IR.instruction.IRcmptype.*;
import static AST.Optype.*;


public class IRBuilder implements ASTVisitor
{
    Block current_block;
    Function current_function;
    public IRBuilder()
    {
        
    }
    @Override
    public void visit(ProgramAST AST)
    {

    }

    @Override
    public void visit(VarAST AST)
    {

    }

    @Override
    public void visit(VarlistAST AST)
    {

    }

    @Override
    public void visit(SingleTypeAST AST)
    {

    }

    @Override
    public void visit(ArrayTypeAST AST)
    {

    }

    @Override
    public void visit(ClassdefAST AST)
    {

    }

    @Override
    public void visit(FunctiondefAST AST)
    {

    }

    @Override
    public void visit(GlobalVardefAST AST)
    {

    }

    @Override
    public void visit(ConstIntAST AST)
    {
        AST.set_right_value_operand(new OperandConstInt(AST.get_val()));
    }

    @Override
    public void visit(ConstBoolAST AST)
    {
        AST.set_right_value_operand(new OperandConstBool(AST.get_val()));
    }

    @Override
    public void visit(ConstStringAST AST)
    {

    }

    @Override
    public void visit(ConstNullAST AST)
    {
        AST.set_right_value_operand(new OperandConstNull());
    }

    @Override
    public void visit(IdentifierExprAST AST)
    {

    }

    @Override
    public void visit(MemberAST AST)
    {

    }

    @Override
    public void visit(IndexAST AST)
    {

    }

    @Override
    public void visit(FunctionParamAST AST)
    {

    }

    @Override
    public void visit(UnaryPreAST AST)
    {
        ExprAST expr = AST.get_ExprAST();
        expr.accept(this);
        Optype pre_op = AST.get_optype();
        Operand expr_operand_right = expr.get_right_value_operand();
        Operand expr_operand_left = expr.get_left_value_operand();
        if(pre_op == op_zheng)
        {
            AST.set_right_value_operand(expr_operand_right);
        }
        else if(pre_op == op_fu)
        {
            Register result = new Register(new IRtypeInt(32), "fu");
            current_block.add_instruction(new IRinstBinary(result, sub, new OperandConstInt(0), expr_operand_right));
            AST.set_right_value_operand(result);
        }
        else if(pre_op == op_zizeng)
        {
            Register result = new Register(new IRtypeInt(32), "pre_zizeng");
            current_block.add_instruction(new IRinstBinary(result, add, expr_operand_right, new OperandConstInt(1)));
            current_block.add_instruction(new IRinststore(expr_operand_left, result));
            AST.set_right_value_operand(result);
            AST.set_left_value_operand(expr_operand_left);
        }
        else if(pre_op == op_zijian)
        {
            Register result = new Register(new IRtypeInt(32), "pre_zijian");
            current_block.add_instruction(new IRinstBinary(result, sub, expr_operand_right, new OperandConstInt(1)));
            current_block.add_instruction(new IRinststore(expr_operand_left, result));
            AST.set_right_value_operand(result);
            AST.set_left_value_operand(expr_operand_left);
        }
        else if(pre_op == op_not)
        {
            Register result = new Register(new IRtypeInt(32), "not");
            current_block.add_instruction(new IRinstBinary(result, xor, new OperandConstInt(-1), expr_operand_right));
            AST.set_right_value_operand(result);
        }
        else if(pre_op == op_logic_not)
        {
            Register result = new Register(new IRtypeInt(1), "logicnot");
            current_block.add_instruction(new IRinstBinary(result, xor, new OperandConstBool(true), expr_operand_right));
            AST.set_right_value_operand(result);
        }
        else
            System.out.println("???IR_unary_pre");
    }

    @Override
    public void visit(UnaryPosAST AST)
    {
        ExprAST expr = AST.get_ExprAST();
        expr.accept(this);
        Optype pos_op = AST.get_optype();
        Operand expr_operand_right = expr.get_right_value_operand();
        Operand expr_operand_left = expr.get_left_value_operand();
        if(pos_op == op_zizeng)
        {
            Register result = new Register(new IRtypeInt(32), "pos_zizeng");
            current_block.add_instruction(new IRinstBinary(result, add, expr_operand_right, new OperandConstInt(1)));
            current_block.add_instruction(new IRinststore(expr_operand_left, result));
            AST.set_right_value_operand(expr_operand_right);
        }
        else if(pos_op == op_zijian)
        {
            Register result = new Register(new IRtypeInt(32), "pos_zijian");
            current_block.add_instruction(new IRinstBinary(result, sub, expr_operand_right, new OperandConstInt(1)));
            current_block.add_instruction(new IRinststore(expr_operand_left, result));
            AST.set_right_value_operand(expr_operand_right);
            AST.set_left_value_operand(expr_operand_left);
        }
    }

    @Override
    public void visit(BinaryAST AST)
    {
        ExprAST lhs = AST.get_lhs();
        ExprAST rhs = AST.get_rhs();
        lhs.accept(this);
        rhs.accept(this);
        Optype binop = AST.get_optype();
        Operand lhs_operand = lhs.get_right_value_operand();
        Operand rhs_operand = rhs.get_right_value_operand();
        if(binop == op_multi)
        {
            Register result = new Register(new IRtypeInt(32), "multi");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, mul, lhs_operand, rhs_operand));
        }
        else if(binop == op_divide)
        {
            Register result = new Register(new IRtypeInt(32), "divide");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, sdiv, lhs_operand, rhs_operand));
        }
        else if(binop == op_mod)
        {
            Register result = new Register(new IRtypeInt(32), "mod");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, srem, lhs_operand, rhs_operand));
        }
        else if(binop == op_add)
        {
            if((lhs.get_type() instanceof VartypeInt) && (rhs.get_type() instanceof VartypeInt))
            {
                Register result = new Register(new IRtypeInt(32), "add");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstBinary(result, add, lhs_operand, rhs_operand));
            }
            else if((lhs.get_type() instanceof VartypeString) && (rhs.get_type() instanceof VartypeString))
            {

            }
            else
                System.out.println("???binop_add");
        }
        else if(binop == op_minus)
        {
            Register result = new Register(new IRtypeInt(32), "minus");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, sub, lhs_operand, rhs_operand));
        }
        else if(binop == op_left_shift)
        {
            Register result = new Register(new IRtypeInt(32), "left_shift");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, shl, lhs_operand, rhs_operand));
        }
        else if(binop == op_right_shift)
        {
            Register result = new Register(new IRtypeInt(32), "right_shift");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, ashr, lhs_operand, rhs_operand));
        }
        else if(binop == op_xiaoyu)
        {
            if((lhs.get_type() instanceof VartypeInt) && (rhs.get_type() instanceof VartypeInt))
            {
                Register result = new Register(new IRtypeInt(32), "xiaoyu");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, slt, lhs_operand, rhs_operand));
            }
            else if((lhs.get_type() instanceof VartypeString) && (rhs.get_type() instanceof VartypeString))
            {

            }
            else
                System.out.println("???binop_xiaoyu");
        }
        else if(binop == op_dayu)
        {
            if((lhs.get_type() instanceof VartypeInt) && (rhs.get_type() instanceof VartypeInt))
            {
                Register result = new Register(new IRtypeInt(1), "dayu");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, sgt, lhs_operand, rhs_operand));
            }
            else if((lhs.get_type() instanceof VartypeString) && (rhs.get_type() instanceof VartypeString))
            {

            }
            else
                System.out.println("???binop_dayu");
        }
        else if(binop == op_xiaoyudengyu)
        {
            if((lhs.get_type() instanceof VartypeInt) && (rhs.get_type() instanceof VartypeInt))
            {
                Register result = new Register(new IRtypeInt(1), "xiaoyudengyu");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, sle, lhs_operand, rhs_operand));
            }
            else if((lhs.get_type() instanceof VartypeString) && (rhs.get_type() instanceof VartypeString))
            {

            }
            else
                System.out.println("???binop_xiaoyudengyu");
        }
        else if(binop == op_dayudengyu)
        {
            if((lhs.get_type() instanceof VartypeInt) && (rhs.get_type() instanceof VartypeInt))
            {
                Register result = new Register(new IRtypeInt(1), "dayudengyu");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, sge, lhs_operand, rhs_operand));
            }
            else if((lhs.get_type() instanceof VartypeString) && (rhs.get_type() instanceof VartypeString))
            {

            }
            else
                System.out.println("???binop_dayudengyu");
        }
        else if(binop == op_equal)
        {
            Vartype ltype = AST.get_lhs().get_type();
            Vartype rtype = AST.get_rhs().get_type();
            if(ltype instanceof VartypeInt && rtype instanceof VartypeInt)
            {
                Register result = new Register(new IRtypeInt(1), "equal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, eq, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeBool && rtype instanceof VartypeBool)
            {
                Register result = new Register(new IRtypeInt(1), "equal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, eq, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeString && rtype instanceof VartypeString)
            {

            }
            else if(ltype instanceof VartypeArray && rtype instanceof VartypeNull)
            {
                Register result = new Register(new IRtypeInt(1), "equal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, eq, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeNull && rtype instanceof VartypeArray)
            {
                Register result = new Register(new IRtypeInt(1), "equal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, eq, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeClass && rtype instanceof VartypeNull)
            {
                Register result = new Register(new IRtypeInt(1), "equal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, eq, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeNull && rtype instanceof VartypeClass)
            {
                Register result = new Register(new IRtypeInt(1), "equal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, eq, lhs_operand, rhs_operand));
            }
        }
        else if(binop == op_not_equal)
        {
            Vartype ltype = AST.get_lhs().get_type();
            Vartype rtype = AST.get_rhs().get_type();
            if(ltype instanceof VartypeInt && rtype instanceof VartypeInt)
            {
                Register result = new Register(new IRtypeInt(1), "notequal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, ne, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeBool && rtype instanceof VartypeBool)
            {
                Register result = new Register(new IRtypeInt(1), "notequal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, ne, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeString && rtype instanceof VartypeString)
            {

            }
            else if(ltype instanceof VartypeArray && rtype instanceof VartypeNull)
            {
                Register result = new Register(new IRtypeInt(1), "notequal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, ne, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeNull && rtype instanceof VartypeArray)
            {
                Register result = new Register(new IRtypeInt(1), "notequal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, ne, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeClass && rtype instanceof VartypeNull)
            {
                Register result = new Register(new IRtypeInt(1), "notequal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, ne, lhs_operand, rhs_operand));
            }
            else if(ltype instanceof VartypeNull && rtype instanceof VartypeClass)
            {
                Register result = new Register(new IRtypeInt(1), "notequal");
                AST.set_right_value_operand(result);
                current_block.add_instruction(new IRinstcmp(result, ne, lhs_operand, rhs_operand));
            }
        }
        else if(binop == op_and)
        {
            Register result = new Register(new IRtypeInt(32), "and");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, and, lhs_operand, rhs_operand));
        }
        else if(binop == op_xor)
        {
            Register result = new Register(new IRtypeInt(32), "xor");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, xor, lhs_operand, rhs_operand));
        }
        else if(binop == op_or)
        {
            Register result = new Register(new IRtypeInt(32), "or");
            AST.set_right_value_operand(result);
            current_block.add_instruction(new IRinstBinary(result, or, lhs_operand, rhs_operand));
        }
        else if(binop == op_logic_and)
        {
            Register result = new Register(new IRtypeInt(32), "logic_and");
            AST.set_right_value_operand(result);
        }
        else if(binop == op_logic_or)
        {
            Register result = new Register(new IRtypeInt(32), "logic_or");
            AST.set_right_value_operand(result);
        }
        else if(binop == op_assign)
        {
            AST.set_right_value_operand(rhs_operand);
            current_block.add_instruction(new IRinststore(AST.get_lhs().get_left_value_operand(), rhs_operand));
        }
        else
        {
            System.out.println("???IRbinop");
        }
    }

    @Override
    public void visit(NewAST AST)
    {

    }

    @Override
    public void visit(ThisAST AST)
    {

    }

    @Override
    public void visit(StatementsAST AST)
    {
        for(StatementAST i: AST.get_statements())
            i.accept(this);
    }

    @Override
    public void visit(VardefandinitStatementAST AST)
    {

    }

    @Override
    public void visit(VarmultidefStatementAST AST)
    {

    }

    @Override
    public void visit(IfStatementAST AST)
    {
        Block todo_block = new Block("if_todo_block");
        Block else_block = new Block("if_else_block");
        Block terminal_block = new Block("if_terminal_block");
        ExprAST if_cond = AST.get_condition();
        if_cond.accept(this);
        Operand if_cond_result = if_cond.get_right_value_operand();
        current_block.add_instruction(new IRinstbr(if_cond_result, todo_block, else_block));

        current_block = todo_block;
        if(AST.todo_statement_exist())
            AST.get_todo_statement().accept(this);
        current_block.add_instruction(new IRinstbr(null, terminal_block, null));
        current_function.add_block(todo_block);

        current_block = else_block;
        if(AST.else_statement_exist())
            AST.get_else_statement().accept(this);
        current_block.add_instruction(new IRinstbr(null, terminal_block, null));
        current_function.add_block(else_block);

        current_block = terminal_block;
        current_function.add_block(terminal_block);

    }

    @Override
    public void visit(ForStatementAST AST)
    {
        
    }

    @Override
    public void visit(WhileStatementAST AST)
    {

    }

    @Override
    public void visit(ReturnStatementAST AST)
    {

    }

    @Override
    public void visit(BreakStatementAST AST)
    {

    }

    @Override
    public void visit(ContinueStatementAST AST)
    {

    }

    @Override
    public void visit(ExprStatementAST AST)
    {

    }
}

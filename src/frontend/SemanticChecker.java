package frontend;

import AST.*;
import utility.*;
import utility.Error;

import static AST.Optype.*;

public class SemanticChecker implements ASTVisitor
{
    Scope current_scope;
    public SemanticChecker()
    {

    }
    @Override
    public void visit(ProgramAST AST)
    {
        current_scope = new Scope(null);

    }

    @Override
    public void visit(VarAST varAST)
    {

    }

    @Override
    public void visit(VarlistAST varlistAST)
    {

    }

    @Override
    public void visit(TypeAST AST)
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

//    @Override
//    public void visit(ParamlistAST AST)
//    {
//
//    }
//
//    @Override
//    public void visit(ParamAST AST)
//    {
//
//    }

    @Override
    public void visit(ExprStatementAST AST)
    {

    }

    @Override
    public void visit(ContinueStatementAST AST)
    {

    }

    @Override
    public void visit(BreakStatementAST AST)
    {

    }

    @Override
    public void visit(ReturnStatementAST AST)
    {

    }

    @Override
    public void visit(WhileStatementAST AST)
    {

    }

    @Override
    public void visit(ForStatementAST AST)
    {

    }

    @Override
    public void visit(IfStatementAST AST)
    {

    }

    @Override
    public void visit(VarmultidefStatementAST AST)
    {

    }

    @Override
    public void visit(VardefandinitStatementAST AST)
    {

    }

    @Override
    public void visit(StatementsAST AST)
    {

    }

    @Override
    public void visit(ThisAST AST)
    {

    }

    @Override
    public void visit(NewAST AST)
    {

    }

    @Override
    public void visit(BinaryAST AST)
    {
        AST.get_lhs().accept(this);
        AST.get_rhs().accept(this);
        Optype binop = AST.get_optype();
        ExprAST lexpr = AST.get_lhs();
        ExprAST rexpr = AST.get_rhs();
        Vartype ltype = lexpr.get_type();
        Vartype rtype = rexpr.get_type();
        Position lpos = lexpr.get_position();
        Position rpos = rexpr.get_position();
        if(binop == op_minus || binop == op_multi || binop == op_divide || binop == op_mod || binop == op_left_shift || binop == op_right_shift || binop == op_and || binop == op_or || binop == op_xor)
        {
            if(!(ltype instanceof VartypeInt))
                throw new Error(lpos, "在二元运算符" + binop + "中，左边不是int");
            if(!(rtype instanceof VartypeInt))
                throw new Error(rpos, "在二元运算符" + binop + "中，右边不是int");
            AST.set_type(new VartypeInt());
        }
        else if(binop == op_add)
        {
            if(ltype instanceof VartypeInt)
            {
                if(rtype instanceof VartypeInt)
                    AST.set_type(new VartypeInt());
                else if(rtype instanceof VartypeString)
                    AST.set_type(new VartypeString());
                else
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是int，右边不是int或String");
            }
            else if(ltype instanceof VartypeString)
            {
                if(rtype instanceof VartypeInt || rtype instanceof VartypeString)
                    AST.set_type(new VartypeString());
                else
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是String，右边不是int或String");
            }
        }
        else if(binop == op_xiaoyu || binop == op_xiaoyudengyu || binop == op_dayu || binop == op_dayudengyu)
        {
            if(ltype instanceof VartypeInt)
            {
                if(!(rtype instanceof VartypeInt))
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是int，右边不是int");
                else
                    AST.set_type(new VartypeBool());
            }
            else if(ltype instanceof VartypeString)
            {
                if(!(rtype instanceof VartypeString))
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是String，右边不是String");
                else
                    AST.set_type(new VartypeBool());
            }
            else
                throw new Error(lpos, "二元运算符" + binop + "只能用于比较int或String");

        }
        else if(binop == op_equal || binop == op_not_equal)
        {
            if(((ltype instanceof VartypeInt) && (rtype instanceof VartypeInt))
                ||((ltype instanceof VartypeString) && (rtype instanceof VartypeString))
                ||((ltype instanceof VartypeBool) && (rtype instanceof VartypeBool)))
                AST.set_type(new VartypeBool());
            else
                throw new Error(lpos, "二元运算符" + binop + "只能用于同类比较");
        }
        else if(binop == op_logic_and || binop == op_logic_or)
        {
            if(!(ltype instanceof VartypeBool))
                throw new Error(lpos, "在二元运算符" + binop + "中，左边不是bool");
            if(!(rtype instanceof VartypeBool))
                throw new Error(rpos, "在二元运算符" + binop + "中，右边不是bool");
            AST.set_type(new VartypeBool());
        }
        else if(binop == op_assign)
            AST.set_type(ltype);
        else
            throw new Error(AST.get_position(), "op empty unknown error");
    }

    @Override
    public void visit(UnaryPosAST AST)
    {
        AST.get_ExprAST().accept(this);
        Position position = AST.get_position();
        Optype optype = AST.get_optype();
        Vartype type = AST.get_ExprAST().get_type();
        if(!(type instanceof VartypeInt))
            throw new Error(position, "一元后置运算符" + optype + "只能作用于int");
        AST.set_type(new VartypeInt());
    }

    @Override
    public void visit(UnaryPreAST AST)
    {
        AST.get_ExprAST().accept(this);
        Position position = AST.get_position();
        Optype optype = AST.get_optype();
        Vartype type = AST.get_ExprAST().get_type();
        if(optype == op_zizeng || optype == op_zijian || optype == op_zheng || optype == op_fu || optype == op_not)
        {
            if(!(type instanceof VartypeInt))
                throw new Error(position, "一元前置运算符" + optype + "只能作用于int");
            AST.set_type(new VartypeInt());
        }
        else if(optype == op_logic_not)
        {
            if(!(type instanceof VartypeBool))
                throw new Error(position, "一元前置运算符" + optype + "只能作用于bool");
            AST.set_type(new VartypeBool());
        }
        else
            throw new Error(position, "op empty unknown error");
    }

    @Override
    public void visit(FunctionParamAST AST)
    {

    }

    @Override
    public void visit(IndexAST AST)
    {

    }

    @Override
    public void visit(MemberAST AST)   //a.member; a.function();
    {
        AST.get_ExprAST().accept(this);
        ExprAST expr = AST.get_ExprAST();
        Vartype type = expr.get_type();

    }

    @Override
    public void visit(IdentifierExprAST AST)
    {

    }

    @Override
    public void visit(ConstNullAST AST){}

    @Override
    public void visit(ConstStringAST AST)
    {
        AST.set_type(new VartypeString());
    }

    @Override
    public void visit(ConstBoolAST AST)
    {
        AST.set_type(new VartypeBool());
    }

    @Override
    public void visit(ConstIntAST AST)
    {
        AST.set_type(new VartypeInt());
    }

    @Override
    public void visit(FunctiondefAST AST)
    {
    }
}

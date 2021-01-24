package frontend;

import AST.*;
import utility.*;
import utility.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import static AST.Optype.*;

public class SemanticChecker implements ASTVisitor
{
    HashMap<String, Vartype> type_table;
//    HashMap<String, TypeAST> function_table;
    Scope global_scope;
    Scope current_scope;
    Stack<Scope> scope_stack;
    public boolean put_into_type_table(String typename, Vartype vartp)
    {
        if(this.type_table.containsKey(typename))
            return false;
        else
        {
            this.type_table.put(typename, vartp);
            return true;
        }
    }
    public boolean find_in_type_table(String typename)
    {
        return this.type_table.containsKey(typename);
    }
//    public boolean put_into_function_table(String funcname, TypeAST typeAST)
//    {
//        if(this.function_table.containsKey(funcname))
//            return false;
//        else
//        {
//            this.function_table.put(funcname, typeAST);
//            return true;
//        }
//    }
//    public boolean find_in_function_table(String funcname)
//    {
//        return this.function_table.containsKey(funcname);
//    }
    public SemanticChecker()
    {
        scope_stack = new Stack<>();
        global_scope = new Scope(null);
        scope_stack.add(global_scope);
        current_scope = global_scope;
        type_table = new HashMap<>();
    }
    @Override
    public void visit(ProgramAST AST)
    {
        ArrayList<ProgramPartAST> program_parts = AST.get_program_parts();
        for(ProgramPartAST i: program_parts)
            if(i instanceof ClassdefAST)
            {
                String typename = ((ClassdefAST) i).get_identifier();
                VartypeClass new_type_class = new VartypeClass(typename);
                if(!put_into_type_table(typename, new_type_class))
                    throw new Error(i.get_position(), "类名重定义");
                if(current_scope.contain_object(typename, false))
                    throw new Error(i.get_position(), "类名与已有变量名、类名、函数名冲突");
            }
        for(ProgramPartAST i: program_parts)
            if(i instanceof FunctiondefAST)
            {
                String function_name = ((FunctiondefAST) i).get_function_name();
//                TypeAST function_return_typeAST = ((FunctiondefAST) i).get_return_vartype();
                current_scope.add_object(function_name, i.get_position());
            }
        for(ProgramPartAST i: program_parts)
            if(i instanceof GlobalVardefAST)
                i.accept(this);
        for(ProgramPartAST i: program_parts)
            if(i instanceof FunctiondefAST)
                i.accept(this);
        for(ProgramPartAST i: program_parts)
            if(i instanceof ClassdefAST)
                i.accept(this);

        if(!(global_scope.contain_object("main", false)))
            throw new Error(new Position(0, 0), "找不到main函数");
    }

    @Override
    public void visit(VarAST AST)
    {
        AST.get_var_type().accept(this);
        current_scope.add_object(AST.get_var_name(), AST.get_position());
    }

    @Override
    public void visit(VarlistAST AST)
    {
        ArrayList<VarAST> var_list = AST.get_var_list();
        for(VarAST i: var_list)
            i.accept(this);
    }

    @Override
    public void visit(SingleTypeAST AST)
    {
        if(!find_in_type_table(AST.get_typename()))
            throw new Error(AST.get_position(), "找不到"+AST.get_typename()+"类型");
    }

    @Override
    public void visit(ArrayTypeAST AST)
    {
        if(!find_in_type_table(AST.get_typename()))
            throw new Error(AST.get_position(), "找不到(基础类型)"+AST.get_typename()+"类型");
    }

    @Override
    public void visit(ClassdefAST AST)
    {
        Scope new_scope = new Scope(current_scope);
        scope_stack.add(new_scope);
        current_scope = new_scope;
        ArrayList<VardefStatementAST> var_def_statements = AST.get_var_def_statements();
        for(VardefStatementAST i: var_def_statements)
            i.accept(this);

    }


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
        TypeAST vartypeAST = AST.get_vartype();
        ArrayList<String> identifiers = AST.get_identifiers();


    }

    @Override
    public void visit(VardefandinitStatementAST AST)
    {

    }

    @Override
    public void visit(StatementsAST AST)
    {
        Scope newscope = new Scope(current_scope);
        scope_stack.add(newscope);
        ArrayList<StatementAST> statements = AST.get_statements();
        for(StatementAST i: statements)
            i.accept(this);
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
    public void visit(FunctionParamAST AST)    //只能是a.function()或者func
    {
        ExprAST function_name = AST.get_function_name();
        if(function_name instanceof MemberAST)
            function_name.accept(this);
        else if(function_name instanceof IdentifierExprAST)
            if(!current_scope.contain_function(((IdentifierExprAST) function_name).get_name()))
                throw new Error(function_name.get_position(), ((IdentifierExprAST) function_name).get_name()+"不是一个函数");
        ArrayList<ExprAST> params = AST.get_params();
        for(ExprAST i: params)
            i.accept(this);
    }

    @Override
    public void visit(IndexAST AST)
    {
        ExprAST main_expr = AST.get_mainExprAST();
        ExprAST index_expr = AST.get_indexExprAST();
        main_expr.accept(this);
        index_expr.accept(this);
        Vartype main_expr_type = main_expr.get_type();
        Vartype index_expr_type = index_expr.get_type();
//        if(!(main_expr_type instanceof VartypeArray))
//            throw new Error(main_expr.get_position(), "[]下标运算符调用的不是数组类型");
        if(!(index_expr_type instanceof VartypeInt))
            throw new Error(index_expr.get_position(), "[]下标运算符索引不是int类型");
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
        if(!current_scope.contain_object(AST.get_name(), true))
            throw new Error(AST.get_position(), "此标识符未定义");
        else if(!current_scope.contain_varname(AST.get_name()))
            throw new Error(AST.get_position(), "此标识符被定义为一个函数");
        AST.set_type(current_scope.get_vartype_with_varname(AST.get_name(), AST.get_position()));
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

    @Override
    public void visit(GlobalVardefAST AST)
    {

    }
}

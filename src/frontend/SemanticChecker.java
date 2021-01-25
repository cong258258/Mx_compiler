package frontend;

import AST.*;
import utility.*;
import utility.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import static AST.Optype.*;
import static utility.Scopetype.*;

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
    public Vartype get_vartype_in_type_table_with_typename(String typename)
    {
        return this.type_table.get(typename);
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
        global_scope = new Scope(null, normal_scope);
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
        TypeAST var_typeAST = AST.get_var_type();
        var_typeAST.accept(this);
        String var_typename;
        if(var_typeAST instanceof SingleTypeAST)
            var_typename = ((SingleTypeAST) var_typeAST).get_typename();
        else if(var_typeAST instanceof ArrayTypeAST)
            var_typename = ((ArrayTypeAST) var_typeAST).get_typename();
        else
            throw new Error(null, "fuck");
        current_scope.add_varname(AST.get_var_name(), get_vartype_in_type_table_with_typename(var_typename), AST.get_position());
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
        Scope new_scope = new Scope(current_scope, class_scope);
        scope_stack.add(new_scope);
        current_scope = new_scope;
        ArrayList<VardefStatementAST> var_def_statements = AST.get_var_def_statements();
        for(VardefStatementAST i: var_def_statements)
            i.accept(this);
        ArrayList<FunctiondefAST> functions = AST.get_functions();
        for(FunctiondefAST i: functions)
            i.accept(this);
        scope_stack.pop();
        current_scope = scope_stack.peek();
    }


    @Override
    public void visit(ExprStatementAST AST)
    {
        AST.get_expr().accept(this);
    }

    @Override
    public void visit(ContinueStatementAST AST)
    {
        if(current_scope.get_scope_type() != loop_scope)
            throw new Error(AST.get_position(), "continue语句不在循环中");
    }

    @Override
    public void visit(BreakStatementAST AST)
    {
        if(current_scope.get_scope_type() != loop_scope)
            throw new Error(AST.get_position(), "break语句不在循环中");
    }

    @Override
    public void visit(ReturnStatementAST AST)
    {
        if(current_scope.get_scope_type() != function_scope)
            throw new Error(AST.get_position(), "return语句不在函数中");
        if(AST.return_expr_exist())
            AST.get_return_expr().accept(this);
    }

    @Override
    public void visit(WhileStatementAST AST)
    {
        ExprAST condition = AST.get_condition();
        StatementAST todo_statement = AST.get_todo_statement();
        condition.accept(this);
        if(!condition.get_type().equals(new VartypeBool()))
            throw new Error(condition.get_position(), "while语句中，条件表达式返回非bool类型");
        if(todo_statement instanceof StatementsAST)
            todo_statement.accept(this);
        else
        {
            Scope new_scope = new Scope(current_scope, loop_scope);
            scope_stack.add(new_scope);
            current_scope = new_scope;
            todo_statement.accept(this);
            scope_stack.pop();
            current_scope = scope_stack.peek();
        }
    }

    @Override
    public void visit(ForStatementAST AST)
    {
        if(AST.init_exist())
            AST.get_init().accept(this);
        if(AST.condition_exist())
        {
            ExprAST condition = AST.get_condition();
            condition.accept(this);
            if(!condition.get_type().equals(new VartypeBool()))
                throw new Error(condition.get_position(), "for语句的循环条件语句中，条件表达式返回非bool类型");
        }
        if(AST.update_exist())
            AST.get_update().accept(this);
        StatementAST todo_statement = AST.get_todo_statement();
        if(todo_statement instanceof StatementsAST)
            todo_statement.accept(this);
        else
        {
            Scope new_scope = new Scope(current_scope, loop_scope);
            scope_stack.add(new_scope);
            current_scope = new_scope;
            todo_statement.accept(this);
            scope_stack.pop();
            current_scope = scope_stack.peek();
        }
    }

    @Override
    public void visit(IfStatementAST AST)
    {
        ExprAST condition = AST.get_condition();
        StatementAST todo_statement = AST.get_todo_statement();
        condition.accept(this);
        if(!condition.get_type().equals(new VartypeBool()))
            throw new Error(condition.get_position(), "if语句中，条件表达式返回非bool类型");
        if(todo_statement instanceof StatementsAST)
            todo_statement.accept(this);
        else
        {
            Scope new_scope = new Scope(current_scope, normal_scope);
            scope_stack.add(new_scope);
            current_scope = new_scope;
            todo_statement.accept(this);
            scope_stack.pop();
            current_scope = scope_stack.peek();
        }
        if(AST.else_statement_exist())
        {
            StatementAST else_statement = AST.get_else_statement();
            if(else_statement instanceof StatementsAST)
                else_statement.accept(this);
            else
            {
                Scope new_scope = new Scope(current_scope, normal_scope);
                scope_stack.add(new_scope);
                current_scope = new_scope;
                else_statement.accept(this);
                scope_stack.pop();
                current_scope = scope_stack.peek();
            }
        }
    }

    @Override
    public void visit(VarmultidefStatementAST AST)
    {
        TypeAST vartypeAST = AST.get_vartype();
        ArrayList<String> identifiers = AST.get_identifiers();
        vartypeAST.accept(this);
        String typename;
        if(vartypeAST instanceof SingleTypeAST)
            typename = ((SingleTypeAST) vartypeAST).get_typename();
        else if(vartypeAST instanceof ArrayTypeAST)
            typename = ((ArrayTypeAST) vartypeAST).get_typename();
        else
            throw new Error(null, ":fuck");
        for(String i: identifiers)
            current_scope.add_varname(i, get_vartype_in_type_table_with_typename(typename), AST.get_position());
    }

    @Override
    public void visit(VardefandinitStatementAST AST)
    {
        TypeAST vartypeAST = AST.get_vartype();
        String identifier = AST.get_identifier();
        ExprAST init_expr = AST.get_init_expr();
        String typename;
        vartypeAST.accept(this);
        init_expr.accept(this);
        if(vartypeAST instanceof SingleTypeAST)
            typename = ((SingleTypeAST) vartypeAST).get_typename();
        else if(vartypeAST instanceof ArrayTypeAST)
            typename = ((ArrayTypeAST) vartypeAST).get_typename();
        else
            throw new Error(null, ":fuck");
        Vartype type = get_vartype_in_type_table_with_typename(typename);
        if(type != init_expr.get_type())
            throw new Error(init_expr.get_position(), "赋值左右两边类型不一致");
        current_scope.add_varname(identifier, type, AST.get_position());
    }

    @Override
    public void visit(StatementsAST AST)
    {
        Scope newscope = new Scope(current_scope, normal_scope);
        scope_stack.add(newscope);
        ArrayList<StatementAST> statements = AST.get_statements();
        for(StatementAST i: statements)
            i.accept(this);
        scope_stack.pop();
        current_scope = scope_stack.peek();
    }

    @Override
    public void visit(ThisAST AST)
    {
        if(current_scope.get_scope_type() != class_scope)
            throw new Error(AST.get_position(), "This表达式找不到class作用域");
    }

    @Override
    public void visit(NewAST AST)
    {
        AST.get_vartype().accept(this);
        ArrayList<ExprAST> init_expr = AST.get_init_expr();
        for(ExprAST i: init_expr)
        {
            i.accept(this);
            if(!(i.get_type() instanceof VartypeInt))
                throw new Error(i.get_position(), "数组初始化大小不是int值");
        }
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
        ExprAST expr = AST.get_exprAST();
        String member = AST.get_member_identifier();
        expr.accept(this);
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
        Scope new_scope = new Scope(current_scope, function_scope);
        scope_stack.add(new_scope);
        current_scope = new_scope;
        TypeAST return_vartype = AST.get_return_vartype();
        String function_name = AST.get_function_name();
        VarlistAST params = AST.get_params();
        StatementAST statements = AST.get_statements();
        return_vartype.accept(this);
        params.accept(this);
        statements.accept(this);
        scope_stack.pop();
        current_scope = scope_stack.peek();
    }

    @Override
    public void visit(GlobalVardefAST AST)
    {
        AST.get_vardef_statements().accept(this);
    }
}

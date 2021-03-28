package frontend;

import AST.*;
import org.antlr.v4.runtime.misc.Pair;
import utility.*;
import utility.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import static AST.Optype.*;
import static utility.Scopetype.*;
import static utility.Vartype.*;

public class SemanticChecker implements ASTVisitor
{
    HashMap<String, Vartype> type_table;
    Scope global_scope;
    Scope current_scope;
    Stack<Scope> scope_stack;
    static VartypeInt _standard_vartype_int;
    static VartypeBool _standard_vartype_bool;
    static VartypeString _standard_vartype_string;
    static VartypeVoid _standard_vartype_void;
    static VartypeClass _standard_vartype_class;
    public static VartypeInt get_standard_vartype_int()
    {
        return _standard_vartype_int;
    }
    public static VartypeBool get_standard_vartype_bool()
    {
        return _standard_vartype_bool;
    }
    public static VartypeString get_standard_vartype_string()
    {
        return _standard_vartype_string;
    }
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
    public SemanticChecker()
    {
        scope_stack = new Stack<>();
        global_scope = new Scope(null, normal_scope_type);
        scope_stack.add(global_scope);
        current_scope = global_scope;
        type_table = new HashMap<>();
        _standard_vartype_int = new VartypeInt();
        _standard_vartype_bool = new VartypeBool();
        _standard_vartype_string = new VartypeString();
        _standard_vartype_void = new VartypeVoid();
        _standard_vartype_class = new VartypeClass("_standard_vartype_class_for_this");
        VartypeString.VartypeString_init();
        put_into_type_table("int", _standard_vartype_int);
        put_into_type_table("bool", _standard_vartype_bool);
        put_into_type_table("String", _standard_vartype_string);
        put_into_type_table("void",_standard_vartype_void);
        ArrayList<Pair<Vartype, String>> params;
        params = new ArrayList<>();
        params.add(new Pair<>(_standard_vartype_string, "str"));
        global_scope.add_function("print", _standard_vartype_void, params, new Position(-1,0));
        params = new ArrayList<>();
        params.add(new Pair<>(_standard_vartype_string, "str"));
        global_scope.add_function("println", _standard_vartype_void, params, new Position(-1,0));
        params = new ArrayList<>();
        params.add(new Pair<>(_standard_vartype_int, "n"));
        global_scope.add_function("printInt", _standard_vartype_void, params, new Position(-1,0));
        params = new ArrayList<>();
        params.add(new Pair<>(_standard_vartype_int, "n"));
        global_scope.add_function("printlnInt", _standard_vartype_void, params, new Position(-1,0));
        params = new ArrayList<>();
        global_scope.add_function("getString", _standard_vartype_string, params, new Position(-1,0));
        params = new ArrayList<>();
        global_scope.add_function("getInt", _standard_vartype_int, params, new Position(-1,0));
        params = new ArrayList<>();
        params.add(new Pair<>(_standard_vartype_int, "i"));
        global_scope.add_function("toString", _standard_vartype_string, params, new Position(-1,0));
    }
    @Override
    public void visit(ProgramAST AST)
    {
        ArrayList<ProgramPartAST> program_parts = AST.get_program_parts();
        for(ProgramPartAST i: program_parts)     //定义类的名字
            if(i instanceof ClassdefAST)
            {
                String typename = ((ClassdefAST) i).get_identifier();
                VartypeClass new_type_class_raw = new VartypeClass(typename);
                if(!put_into_type_table(typename, new_type_class_raw))
                    throw new Error(i.get_position(), "类名重定义");
                current_scope.add_varname(typename, new_type_class_raw, i.get_position());
            }


        for(ProgramPartAST i: program_parts)        //定义类的对外接口，类名，成员变量，成员函数原型
            if(i instanceof ClassdefAST)
            {
                String typename = ((ClassdefAST) i).get_identifier();
                VartypeClass new_type_class_raw = (VartypeClass) get_vartype_in_type_table_with_typename(typename);
                Scope tmp_scope = new Scope(current_scope, class_scope_type);     //非检查时作用域 借作用域完成类方法对外接口的定义
                scope_stack.add(tmp_scope);
                current_scope = tmp_scope;
                ArrayList<VardefStatementAST> var_def_statements = ((ClassdefAST) i).get_var_def_statements();
                for(VardefStatementAST j: var_def_statements)
                    j.accept(this);
                new_type_class_raw.set_members(tmp_scope.varname_to_vartype_copy());

                FunctiondefAST constructor = ((ClassdefAST) i).get_constructor();
                if(constructor != null)
                {
                    VarlistAST constructor_params = constructor.get_params();
                    ArrayList<Pair<Vartype, String>> constructor_var_arraylist = new ArrayList<>();
                    if(constructor_params != null)
                    {
                            current_scope = new Scope(current_scope, function_scope_type);
                            constructor_params.accept(this);
                            constructor_var_arraylist = constructor_params.get_var_arraylist();
                            current_scope = scope_stack.peek();
                    }
                    tmp_scope.add_function(constructor.get_function_name(), _standard_vartype_void, constructor_var_arraylist, constructor.get_position());
                    new_type_class_raw.copy_method_from_scope(constructor.get_function_name(), tmp_scope.get_function_entity_with_function_name(constructor.get_function_name()));
                }
                ArrayList<FunctiondefAST> functions = ((ClassdefAST) i).get_functions();
                for(FunctiondefAST j: functions)
                {
                    TypeAST function_return_typeAST = j.get_return_vartype();
                    Vartype function_return_basetype = get_vartype_in_type_table_with_typename(function_return_typeAST.get_typename());
                    Vartype function_return_type;
                    int function_return_type_dimension = function_return_typeAST.get_dimension();
                    if(function_return_type_dimension == 0)
                        function_return_type = function_return_basetype;
                    else
                        function_return_type = new VartypeArray(function_return_basetype, function_return_type_dimension);
                    VarlistAST params = j.get_params();
                    ArrayList<Pair<Vartype, String>> var_arraylist = new ArrayList<>();
                    if(params != null)
                    {
                        current_scope = new Scope(current_scope, function_scope_type);
                        params.accept(this);
                        var_arraylist = params.get_var_arraylist();
                        current_scope = scope_stack.peek();
                    }
                    tmp_scope.add_function(j.get_function_name(), function_return_type, var_arraylist, j.get_position());
                    new_type_class_raw.copy_method_from_scope(j.get_function_name(), tmp_scope.get_function_entity_with_function_name(j.get_function_name()));
                }
                scope_stack.pop();
                current_scope = scope_stack.peek();
            }

        for(ProgramPartAST i: program_parts)        //定义函数的对外接口
            if(i instanceof FunctiondefAST)
            {
                String function_name = ((FunctiondefAST) i).get_function_name();
                TypeAST function_return_typeAST = ((FunctiondefAST) i).get_return_vartype();
                Vartype function_return_type;
                if(function_return_typeAST.get_dimension() == 0)
                    function_return_type = get_vartype_in_type_table_with_typename(function_return_typeAST.get_typename());
                else
                    function_return_type = new VartypeArray(get_vartype_in_type_table_with_typename(function_return_typeAST.get_typename()), function_return_typeAST.get_dimension());
                VarlistAST params = ((FunctiondefAST) i).get_params();
                ArrayList<Pair<Vartype, String>> var_arraylist;
                if(params != null)
                {
                    current_scope = new Scope(current_scope, function_scope_type);
                    params.accept(this);
                    var_arraylist = params.get_var_arraylist();
                    current_scope = scope_stack.peek();
                }
                else
                    var_arraylist = new ArrayList<>();
                current_scope.add_function(function_name, function_return_type, var_arraylist, i.get_position());
            }

        for(ProgramPartAST i: program_parts)//层级访问
            i.accept(this);

        if(!(global_scope.contain_object("main", false)))
            throw new Error(new Position(0, 0), "找不到main函数");
        for(ProgramPartAST i: program_parts)
            if(i instanceof FunctiondefAST && ((FunctiondefAST) i).get_function_name().equals("main"))
            {
                if(!((FunctiondefAST) i).get_return_vartype().get_typename().equals("int"))
                    throw new Error(i.get_position(), "main函数返回值类型不为int");
                if(((FunctiondefAST) i).get_params() != null)
                    throw new Error(((FunctiondefAST) i).get_params().get_position(), "main函数不应有参数");
            }
    }

    @Override
    public void visit(VarAST AST)
    {
        TypeAST var_typeAST = AST.get_var_type();
        var_typeAST.accept(this);
        String var_typename = var_typeAST.get_typename();
        int var_type_dimension = var_typeAST.get_dimension();
        Vartype real_vartype;
        if(var_type_dimension == 0)
            real_vartype = get_vartype_in_type_table_with_typename(var_typename);
        else
            real_vartype = new VartypeArray(get_vartype_in_type_table_with_typename(var_typename), var_type_dimension);
        current_scope.add_varname(AST.get_var_name(), real_vartype, AST.get_position());
        AST.set_var_type_converted(real_vartype);
    }

    @Override
    public void visit(VarlistAST AST)
    {
        ArrayList<VarAST> var_list = AST.get_var_list();
        for(VarAST i: var_list)
        {
            i.accept(this);
            AST.add_into_var_arraylist(i.get_var_type_converted(), i.get_var_name());
        }
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
        Scope new_scope = new Scope(current_scope, class_scope_type);
        scope_stack.add(new_scope);
        current_scope = new_scope;
        String classname = AST.get_identifier();
        Vartype class_vartype = get_vartype_in_type_table_with_typename(classname);
        current_scope.set_class_type_for_class_scope(class_vartype);
        current_scope.copy_scope_from_class_vartype(class_vartype);
        ArrayList<VardefStatementAST> var_def_statements = AST.get_var_def_statements();
        for(VardefStatementAST i: var_def_statements)
            i.accept(this);
        FunctiondefAST constructor = AST.get_constructor();
        if(constructor != null)
            constructor.accept(this);
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
        if(!current_scope.check_scope(loop_scope_type))
            throw new Error(AST.get_position(), "continue语句不在循环中");
    }

    @Override
    public void visit(BreakStatementAST AST)
    {
        if(!current_scope.check_scope(loop_scope_type))
            throw new Error(AST.get_position(), "break语句不在循环中");
    }

    @Override
    public void visit(ReturnStatementAST AST)
    {
        if(!current_scope.check_scope(function_scope_type))
            throw new Error(AST.get_position(), "return语句不在函数中");
        current_scope.set_return_statement_status();
        Vartype return_type = current_scope.get_return_type_for_function_scope();
        ExprAST return_expr = AST.get_return_expr();
        if(return_expr != null)
        {
            return_expr.accept(this);
            if(is_same_type(return_type,_standard_vartype_void))
                throw new Error(return_expr.get_position(), "void返回类型函数不应有返回值");
            else
            {
                if(!is_assignable(return_type, return_expr.get_type()))
                  throw new Error(AST.get_position(), "函数类型与返回类型不同") ;
            }
        }
        else
        {
            if(!is_same_type(return_type, _standard_vartype_void))
                throw new Error(AST.get_position(), "返回值表达式缺失");
        }
    }

    @Override
    public void visit(WhileStatementAST AST)
    {
        ExprAST condition = AST.get_condition();
        condition.accept(this);
        if(!(condition.get_type() instanceof VartypeBool))
            throw new Error(condition.get_position(), "while语句中，条件表达式返回非bool类型");
        if(AST.todo_statement_exist())
        {
            StatementAST todo_statement = AST.get_todo_statement();
            Scope new_scope = new Scope(current_scope, loop_scope_type);
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
            if(!is_same_type(condition.get_type(), _standard_vartype_bool))
                throw new Error(condition.get_position(), "for语句的循环条件语句中，条件表达式返回非bool类型");
        }
        if(AST.update_exist())
            AST.get_update().accept(this);
        if(AST.todo_statement_exist())
        {
            StatementAST todo_statement = AST.get_todo_statement();
            Scope new_scope = new Scope(current_scope, loop_scope_type);
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
        condition.accept(this);
        if(!(condition.get_type() instanceof VartypeBool))
            throw new Error(condition.get_position(), "if语句中，条件表达式返回非bool类型");
        if(AST.todo_statement_exist())
        {
            StatementAST todo_statement = AST.get_todo_statement();
            if(todo_statement instanceof StatementsAST)
                todo_statement.accept(this);
            else
            {
                Scope new_scope = new Scope(current_scope, normal_scope_type);
                scope_stack.add(new_scope);
                current_scope = new_scope;
                todo_statement.accept(this);
                scope_stack.pop();
                current_scope = scope_stack.peek();
            }
        }
        if(AST.else_statement_exist())
        {
            StatementAST else_statement = AST.get_else_statement();
            if(else_statement instanceof StatementsAST)
                else_statement.accept(this);
            else
            {
                Scope new_scope = new Scope(current_scope, normal_scope_type);
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
        String typename = vartypeAST.get_typename();
        int dimension = vartypeAST.get_dimension();
        Vartype type;
        if(typename.equals("void"))
            throw new Error(vartypeAST.get_position(), "变量类型不能为void");
        if(dimension == 0)
            type = get_vartype_in_type_table_with_typename(typename);
        else
            type = new VartypeArray(get_vartype_in_type_table_with_typename(typename), dimension);
        for(String i: identifiers)
            current_scope.add_varname(i, type, AST.get_position());
    }

    @Override
    public void visit(VardefandinitStatementAST AST)
    {
        TypeAST vartypeAST = AST.get_vartype();
        String identifier = AST.get_identifier();
        ExprAST init_expr = AST.get_init_expr();
        vartypeAST.accept(this);
        init_expr.accept(this);
        String typename = vartypeAST.get_typename();
        int dimension = vartypeAST.get_dimension();
        Vartype type;
        if(typename.equals("void"))
            throw new Error(vartypeAST.get_position(), "变量类型不能为void");
        if(dimension == 0)
            type = get_vartype_in_type_table_with_typename(typename);
        else
            type = new VartypeArray(get_vartype_in_type_table_with_typename(typename), dimension);
        if(!is_assignable(type, init_expr.get_type()))
            throw new Error(init_expr.get_position(), "赋值左右两边类型不一致");
        current_scope.add_varname(identifier, type, AST.get_position());
    }

    @Override
    public void visit(StatementsAST AST)
    {
        Scope newscope = new Scope(current_scope, normal_scope_type);
        scope_stack.add(newscope);
        current_scope = newscope;
        ArrayList<StatementAST> statements = AST.get_statements();
        for(StatementAST i: statements)
            i.accept(this);
        scope_stack.pop();
        current_scope = scope_stack.peek();
    }

    @Override
    public void visit(ThisAST AST)
    {
        if(!current_scope.check_scope(class_scope_type))
            throw new Error(AST.get_position(), "This表达式找不到class作用域");
        AST.set_left_value(true);
        AST.set_type(current_scope.get_class_type_for_class_scope());
    }

    @Override
    public void visit(NewAST AST)
    {
        TypeAST vartype = AST.get_vartype();
        vartype.accept(this);
        ArrayList<ExprAST> init_expr = AST.get_init_expr();
        if(AST.get_dimension_all() == 0)
            AST.set_type(get_vartype_in_type_table_with_typename(vartype.get_typename()));
        else
        {
            if(init_expr != null)
                for(ExprAST i : init_expr)
                {
                    i.accept(this);
                    if(!(i.get_type() instanceof VartypeInt))
                        throw new Error(i.get_position(), "数组初始化大小不是int值");
                }
            AST.set_type(new VartypeArray(get_vartype_in_type_table_with_typename(vartype.get_typename()), AST.get_dimension_all()));
        }
        AST.set_left_value(true);
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
                throw new Error(lpos, "在二元运算符" + binop + "中，左边不是int，而是 " + ltype.get_typename());
            if(!(rtype instanceof VartypeInt))
                throw new Error(rpos, "在二元运算符" + binop + "中，右边不是int，而是 " + ltype.get_typename());
            AST.set_type(_standard_vartype_int);
        }
        else if(binop == op_add)
        {
            if(ltype instanceof VartypeInt)
            {
                if(rtype instanceof VartypeInt)
                    AST.set_type(_standard_vartype_int);
                else if(rtype instanceof VartypeString)
                    AST.set_type(_standard_vartype_int);
                else
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是int，右边不是int或String，而是 " + rtype.get_typename());
            }
            else if(ltype instanceof VartypeString)
            {
                if(rtype instanceof VartypeInt || rtype instanceof VartypeString)
                    AST.set_type(_standard_vartype_string);
                else
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是String，右边不是int或String，而是 " + rtype.get_typename());
            }
            else
                throw new Error(lpos, "二元运算符" + binop + "只能用于整数类型加法或者字符串类型拼接，现有左右变量类型分别为 " + ltype.get_typename() +"， " + rtype.get_typename());
        }
        else if(binop == op_xiaoyu || binop == op_xiaoyudengyu || binop == op_dayu || binop == op_dayudengyu)
        {
            if(ltype instanceof VartypeInt)
            {
                if(!(rtype instanceof VartypeInt))
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是int，右边不是int，而是 " + rtype.get_typename());
                else
                    AST.set_type(_standard_vartype_bool);
            }
            else if(ltype instanceof VartypeString)
            {
                if(!(rtype instanceof VartypeString))
                    throw new Error(rpos, "在二元运算符" + binop + "中，左边是String，右边不是String，而是 " + rtype.get_typename());
                else
                    AST.set_type(_standard_vartype_bool);
            }
            else
                throw new Error(lpos, "二元运算符" + binop + "只能用于比较int或String，现有左右变量类型分别为 " + ltype.get_typename() +"， " + rtype.get_typename());

        }
        else if(binop == op_equal || binop == op_not_equal)
        {
            if(((ltype instanceof VartypeInt) && (rtype instanceof VartypeInt))
                ||((ltype instanceof VartypeString) && (rtype instanceof VartypeString))
                ||((ltype instanceof VartypeBool) && (rtype instanceof VartypeBool))
                ||((ltype instanceof VartypeArray) && (rtype instanceof VartypeNull))
                ||((ltype instanceof VartypeNull) && (rtype instanceof VartypeArray))
                ||((ltype instanceof VartypeClass) && (rtype instanceof VartypeNull))
                ||((ltype instanceof VartypeNull) && (rtype instanceof VartypeClass))
                ||((ltype instanceof VartypeNull) && (rtype instanceof VartypeNull)))
                AST.set_type(_standard_vartype_bool);
            else
                throw new Error(lpos, "二元运算符" + binop + "只能用于同类比较，现有左右变量类型分别为 " + ltype.get_typename() +"， " + rtype.get_typename());
        }
        else if(binop == op_logic_and || binop == op_logic_or)
        {
            if(!(ltype instanceof VartypeBool))
                throw new Error(lpos, "在二元运算符" + binop + "中，左边不是bool，而是 " + ltype.get_typename());
            if(!(rtype instanceof VartypeBool))
                throw new Error(rpos, "在二元运算符" + binop + "中，右边不是bool，而是 " + rtype.get_typename());
            AST.set_type(_standard_vartype_bool);
        }
        else if(binop == op_assign)
        {
            if(ltype instanceof VartypeNull)
                throw new Error(lpos, "null不可被赋值");
            if(!lexpr.is_left_value())
                throw new Error(lpos, "在二元运算符" + binop + "中，赋值左侧不是左值");
            if(!is_assignable(ltype, rtype))
                throw new Error(lpos, "在二元运算符" + binop + "中，左右两边类型不同");
            AST.set_type(ltype);
        }
        else
            throw new Error(AST.get_position(), "op empty unknown error");
    }

    @Override
    public void visit(UnaryPosAST AST)
    {
        ExprAST exprAST = AST.get_ExprAST();
        exprAST.accept(this);
        Position position = AST.get_position();
        Optype optype = AST.get_optype();
        Vartype type = exprAST.get_type();
        if(!(type instanceof VartypeInt))
            throw new Error(position, "一元后置运算符" + optype + "只能作用于int");
        if(!exprAST.is_left_value())
            throw new Error(position, "一元后置运算符" + optype + "只能作用于左值");
        AST.set_type(_standard_vartype_int);
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
            AST.set_type(_standard_vartype_int);
            if(optype == op_zizeng || optype == op_zijian)
                AST.set_left_value(true);
        }
        else if(optype == op_logic_not)
        {
            if(!(type instanceof VartypeBool))
                throw new Error(position, "一元前置运算符" + optype + "只能作用于bool");
            AST.set_type(_standard_vartype_bool);
        }
        else
            throw new Error(position, "op empty unknown error");
    }

    @Override
    public void visit(FunctionParamAST AST)    //只能是a.function()或者func()
    {
        ExprAST function_name = AST.get_function_name();
        if(function_name instanceof MemberAST)
        {
            function_name.accept(this);
            if(!(function_name.get_type() instanceof VartypeMethod))
                throw new Error(function_name.get_position(), ((MemberAST) function_name).get_member_identifier() + "是成员变量，不是方法");
        }
        else if(function_name instanceof IdentifierExprAST)
        {
            if(!current_scope.contain_function(((IdentifierExprAST) function_name).get_name()))
                throw new Error(function_name.get_position(), ((IdentifierExprAST) function_name).get_name() + "不是一个函数");
        }
        else
            throw new Error(function_name.get_position(), "FunctionParamAST unknown instance");

        ArrayList<ExprAST> params = AST.get_params();
        for(ExprAST i: params)
            i.accept(this);
        FunctionEntity function_entity;
        if(function_name instanceof IdentifierExprAST)
            function_entity = current_scope.get_function_entity_with_function_name(((IdentifierExprAST) function_name).get_name());
        else
        {
            VartypeMethod var_type_method = (VartypeMethod) function_name.get_type();
            function_entity = var_type_method.get_master_type().get_function_entity_with_method_name(var_type_method.get_typename());
        }
        ArrayList<Pair<Vartype, String>> real_param_list = function_entity.get_parameters();
        if(real_param_list.size() != params.size())
            throw new Error(AST.get_position(), "参数个数不一致，需要" + real_param_list.size() + "个，给出" + params.size() + "个");
        for(int i = 0; i < real_param_list.size(); i++)
        {
            ExprAST param_provide = params.get(i);
            Pair<Vartype, String> param_need = real_param_list.get(i);
            Vartype param_provide_type = param_provide.get_type();
            Vartype param_need_type = param_need.a;
            if(!is_assignable(param_need_type, param_provide_type))
                throw new Error(param_provide.get_position(), "传参错误");
        }
        AST.set_type(function_entity.get_return_vartype());
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
        if(!(main_expr_type instanceof VartypeArray))
            throw new Error(main_expr.get_position(), "[]下标运算符调用的是 "+main_expr_type.get_typename()+" 类型，不是数组类型");
        if(!(index_expr_type instanceof VartypeInt))
            throw new Error(index_expr.get_position(), "[]下标运算符索引是 "+index_expr.get_type()+" 类型，不是int类型");
        AST.set_left_value(main_expr.is_left_value());
        VartypeArray main_expr_type_array = (VartypeArray) main_expr_type;
        if(main_expr_type_array.get_dimension() == 1)
            AST.set_type(main_expr_type_array.get_basetype());
        else
            AST.set_type(new VartypeArray(main_expr_type_array.get_basetype(), main_expr_type_array.get_dimension()-1));
    }

    @Override
    public void visit(MemberAST AST)   //a.member; a.function();
    {
        ExprAST expr = AST.get_exprAST();
        String member = AST.get_member_identifier();
        expr.accept(this);
        Vartype type = expr.get_type();
        if(type instanceof VartypeClass)
        {
            if(type.has_method(member))
                AST.set_type(new VartypeMethod(member, type));
            else if(((VartypeClass) type).has_member(member))
            {
                AST.set_type(((VartypeClass) type).get_member_type_with_member_name(member));
                AST.set_left_value(true);
            }
            else
                throw new Error(expr.get_position(), "找不到此方法或成员变量"+member);
        }
        else
        {
            if(!type.has_method(member))
                throw new Error(expr.get_position(), "找不到此方法"+member);
            AST.set_type(new VartypeMethod(member, type));
        }
    }

    @Override
    public void visit(IdentifierExprAST AST)
    {
        if(!current_scope.contain_object(AST.get_name(), true))
            throw new Error(AST.get_position(), "此标识符 "+AST.get_name()+" 未定义");
        else if(!current_scope.contain_varname(AST.get_name()))
            throw new Error(AST.get_position(), "此标识符 "+AST.get_name()+" 被定义为一个函数");
        AST.set_type(current_scope.get_vartype_with_varname(AST.get_name(), AST.get_position()));
        AST.set_left_value(true);
    }

    @Override
    public void visit(ConstNullAST AST)
    {
        AST.set_type(new VartypeNull());
    }

    @Override
    public void visit(ConstStringAST AST)
    {
        AST.set_type(_standard_vartype_string);
    }

    @Override
    public void visit(ConstBoolAST AST)
    {
        AST.set_type(_standard_vartype_bool);
    }

    @Override
    public void visit(ConstIntAST AST)
    {
        AST.set_type(_standard_vartype_int);
    }

    @Override
    public void visit(FunctiondefAST AST)
    {
        Scope new_scope = new Scope(current_scope, function_scope_type);
        scope_stack.add(new_scope);
        current_scope = new_scope;
        String function_name = AST.get_function_name();
        current_scope.copy_scope_from_function_entity(current_scope.get_parent_scope().get_function_entity_with_function_name(function_name));
        TypeAST return_vartype = AST.get_return_vartype();
        StatementAST statements = AST.get_statements();
        statements.accept(this);
        if((!function_name.equals("main")) && !return_vartype.get_typename().equals("void"))
            if(!current_scope.has_return_statement())
                throw new Error(AST.get_position(), "找不到return语句");
        scope_stack.pop();
        current_scope = scope_stack.peek();
    }

    @Override
    public void visit(GlobalVardefAST AST)
    {
        AST.get_vardef_statements().accept(this);
    }
}

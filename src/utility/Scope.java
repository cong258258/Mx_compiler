package utility;

import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static utility.Scopetype.*;

public class Scope
{
    Scopetype scope_type;
    HashSet<String> objects;
    HashMap<String, Vartype> varname_to_vartype;
//    HashMap<String, Vartype> function_name_to_function_type;
    HashMap<String, FunctionEntity> function_name_to_function_entity;
    Scope parent_scope;
    Vartype return_type_for_function_scope;
    boolean has_return_statement;

    public Scope(Scope parent, Scopetype scope_type)
    {
        this.scope_type = scope_type;
        this.objects = new HashSet<>();
        this.parent_scope = parent;
        this.varname_to_vartype = new HashMap<>();
//        this.function_name_to_function_type = new HashMap<>();
        this.function_name_to_function_entity = new HashMap<>();
        this.return_type_for_function_scope = null;
        this.has_return_statement = false;
    }
    public void set_return_type_for_function_scope(Vartype vartp)
    {
//        System.out.println(vartp.typename + this.get_scope_type().toString());
        this.return_type_for_function_scope = vartp;
    }
    public Vartype get_return_type_for_function_scope()
    {
//        System.out.println(this.get_scope_type().toString());
        if(this.return_type_for_function_scope != null)
            return this.return_type_for_function_scope;
        else
            return this.parent_scope.get_return_type_for_function_scope();
    }
    public void add_object(String object_name, Position pos)
    {
        if(this.objects.contains(object_name))
        {
//            System.out.println("Error: 作用域中重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "作用域中重定义");
        }
        else
            this.objects.add(object_name);
    }
    public boolean contain_object(String object_name, boolean look_upon)  //object.member
    {
        if (this.objects.contains(object_name))
            return true;
        else if(this.parent_scope != null && look_upon)
            return this.parent_scope.contain_object(object_name, true);
        else
            return false;
    }

    public boolean contain_varname(String varname)
    {
        if(this.varname_to_vartype.containsKey(varname))
            return true;
        else if(this.parent_scope == null)
            return false;
        else
            return this.parent_scope.contain_varname(varname);
    }
    public Vartype get_vartype_with_varname(String varname, Position pos)
    {
//        if(!contain_varname(varname))
//            throw new Error(pos, "找不到" + varname + "类型的变量名");
//        return varname_to_vartype.get(varname);
        if(this.varname_to_vartype.containsKey(varname))
            return this.varname_to_vartype.get(varname);
        else if(this.parent_scope == null)
            throw new Error(pos, "找不到" + varname + "类型的变量名");
        else
            return this.parent_scope.get_vartype_with_varname(varname, pos);
    }
    public void add_varname(String varname, Vartype vartp, Position pos)
    {
//        System.out.println(varname);
        if(this.varname_to_vartype.containsKey(varname))
        {
//            System.out.println("Error: 变量重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "变量重定义");
        }
        else if(contain_object(varname, false))
        {
//            System.out.println("Error: 与函数或类名重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "与函数或类名重定义");
        }
        else
        {
            this.varname_to_vartype.put(varname, vartp);
            this.objects.add(varname);
        }
    }
    public void add_function(String function_name, Vartype vartp, ArrayList<Pair<Vartype, String>> params, Position pos)
    {
//        System.out.println(function_name+vartp.typename);
        if(this.function_name_to_function_entity.containsKey(function_name))
        {
//            System.out.println("Error: 函数名重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "函数名重定义");
        }
        else if(contain_object(function_name, false))
        {
//            System.out.println("Error: 与变量名或类名重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "与变量名或类名重定义");
        }
        else
        {
            FunctionEntity new_function_entity = new FunctionEntity(function_name, vartp, params, pos);
            this.function_name_to_function_entity.put(function_name, new_function_entity);
            this.objects.add(function_name);
        }
    }
    public boolean contain_function(String function_name)
    {
        if(this.function_name_to_function_entity.containsKey(function_name))
            return true;
        else if(this.parent_scope == null)
            return false;
        else
            return this.parent_scope.contain_function(function_name);
    }
    public FunctionEntity get_function_entity_with_function_name(String function_name)
    {
        if(this.function_name_to_function_entity.containsKey(function_name))
            return function_name_to_function_entity.get(function_name);
        else
            return this.parent_scope.get_function_entity_with_function_name(function_name);
    }


//    public void add_function(String function_name, Vartype vartp, Position pos)
//    {
//        System.out.println(function_name+vartp.typename);
//        if(this.function_name_to_function_type.containsKey(function_name))
//        {
//            System.out.println("Error: 函数名重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
//            throw new Error(pos, "函数名重定义");
//        }
//        else
//            this.function_name_to_function_type.put(function_name, vartp);
//    }
//    public boolean contain_function(String function_name)
//    {
//        if(this.function_name_to_function_type.containsKey(function_name))
//            return true;
//        else if(this.parent_scope == null)
//            return false;
//        else
//            return this.parent_scope.contain_function(function_name);
//    }
//    public Vartype get_function_type_with_function_name(String function_name, Position pos)
//    {
//        if(!contain_function(function_name))
//            throw new Error(pos, "找不到" + function_name + "函数");
//        return function_name_to_function_type.get(function_name);
//    }



    public Scope get_parent_scope()
    {
        return this.parent_scope;
    }
    public Scopetype get_scope_type()
    {
        return this.scope_type;
    }
    public boolean check_scope(Scopetype target_scope)
    {
        if(this.get_scope_type() == target_scope)
            return true;
        else if(this.parent_scope == null)
            return false;
        else
            return this.parent_scope.check_scope(target_scope);
    }
    public boolean has_return_statement()
    {
        return this.has_return_statement;
    }
    public void set_return_statement_status()
    {
        if(this.scope_type == function_scope_type)
            this.has_return_statement = true;
        else
            this.parent_scope.set_return_statement_status();
    }
    public HashMap<String, Vartype> varname_to_vartype_copy()
    {
        return this.varname_to_vartype;
    }
    public HashMap<String, FunctionEntity> function_name_to_function_entity_copy()
    {
        return this.function_name_to_function_entity;
    }
}

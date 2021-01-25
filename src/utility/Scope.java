package utility;

import java.util.HashMap;
import java.util.HashSet;


public class Scope
{
    Scopetype scope_type;
    HashSet<String> objects;
    HashMap<String, Vartype> varname_to_vartype;
    HashSet<String> function_name;
    Scope parent_scope;
    public Scope(Scope parent, Scopetype scope_type)
    {
        this.objects = new HashSet<>();
        this.parent_scope = parent;
        this.varname_to_vartype = new HashMap<>();
        this.function_name = new HashSet<>();
    }
    public void add_object(String object_name, Position pos)
    {
        if(this.objects.contains(object_name))
        {
            System.out.println("Error: 作用域中重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
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
        return this.varname_to_vartype.containsKey(varname);
    }
    public Vartype get_vartype_with_varname(String varname, Position pos)
    {
        if(!contain_varname(varname))
            throw new Error(pos, varname);
        return varname_to_vartype.get(varname);
    }
    public void add_varname(String varname, Vartype vartp, Position pos)
    {
        if(this.varname_to_vartype.containsKey(varname))
        {
            System.out.println("Error: 变量重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "变量重定义");
        }
        else if(contain_object(varname, false))
        {
            System.out.println("Error: 与函数或类名重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "与函数或类名重定义");
        }
        else
        {
            this.varname_to_vartype.put(varname, vartp);
            this.objects.add(varname);
        }
    }
    public void add_function(String function_name, Position pos)
    {
        if(this.function_name.contains(function_name))
        {
            System.out.println("Error: 函数名重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "函数名重定义");
        }
        else
            this.function_name.add(function_name);
    }
    public boolean contain_function(String function_name)
    {
        return this.function_name.contains(function_name);
    }
    public Scope get_parent_scope()
    {
        return this.parent_scope;
    }
    public Scopetype get_scope_type()
    {
        return this.scope_type;
    }
}

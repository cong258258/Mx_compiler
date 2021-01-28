package utility;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

public class VartypeClass extends Vartype
{
    HashMap<String, Vartype> members;
    public VartypeClass(String type_namee)
    {
        super.typename = type_namee;
        this.members = new HashMap<>();
        super.methods = new HashMap<>();
    }
    public VartypeClass(String type_namee, HashMap<String, Vartype> varname_to_vartypee, HashMap<String, FunctionEntity> function_name_to_function_entityy)
    {
        super.typename = type_namee;
        this.members = varname_to_vartypee;
        super.methods = function_name_to_function_entityy;
    }
    public boolean contain_member(String varname)
    {
        return this.members.containsKey(varname);
    }
    public Vartype get_member_type_with_member_name(String varname, Position pos)
    {
        if(this.members.containsKey(varname))
            return this.members.get(varname);
        else
            throw new Error(pos, "找不到" + varname + "类型的变量名");
    }
    public void add_member(String varname, Vartype vartp, Position pos)
    {
//        System.out.println(varname);
        if(this.members.containsKey(varname))
        {
            System.out.println("Error: 变量重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "变量重定义");
        }
        else if(contain_function(varname))
        {
            System.out.println("Error: 与函数重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "与函数重定义");
        }
        else
            this.members.put(varname, vartp);
    }
    public void add_function(String function_name, Vartype vartp, ArrayList<Pair<Vartype, String>> params, Position pos)
    {
        System.out.println(function_name+vartp.typename);
        if(this.methods.containsKey(function_name))
        {
            System.out.println("Error: 函数名重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "函数名重定义");
        }
        else
        {
            FunctionEntity new_function_entity = new FunctionEntity(function_name, vartp, params, pos);
            this.methods.put(function_name, new_function_entity);
        }
    }
    public boolean contain_function(String function_name)
    {
        return this.methods.containsKey(function_name);
    }
    public FunctionEntity get_function_entity_with_function_name(String function_name, Position pos)
    {
        if(!contain_function(function_name))
            throw new Error(pos, "找不到" + function_name + "函数");
        return methods.get(function_name);
    }
}

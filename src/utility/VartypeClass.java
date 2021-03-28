package utility;

import org.antlr.v4.runtime.misc.Pair;
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
    public boolean has_member(String varname)
    {
        return this.members.containsKey(varname);
    }
    public Vartype get_member_type_with_member_name(String varname)
    {
        return this.members.get(varname);
    }
    public void add_member(String varname, Vartype vartp, Position pos)
    {
        if(this.members.containsKey(varname))
            throw new Error(pos, "变量重定义");
        else if(has_method(varname))
            throw new Error(pos, "与函数重定义");
        else
            this.members.put(varname, vartp);
    }
    public void add_method(String function_name, Vartype vartp, ArrayList<Pair<Vartype, String>> params, Position pos)
    {
        if(this.methods.containsKey(function_name))
            throw new Error(pos, "函数名重定义");
        else
        {
            FunctionEntity new_function_entity = new FunctionEntity(function_name, vartp, params, pos);
            this.methods.put(function_name, new_function_entity);
        }
    }
    public void copy_method_from_scope(String function_name, FunctionEntity func_entity)
    {
        this.methods.put(function_name, func_entity);
    }

    public void set_members(HashMap<String, Vartype> memberss)
    {
        this.members = memberss;
    }
    public void set_methods(HashMap<String, FunctionEntity> methodss)
    {
        super.methods = methodss;
    }
    public HashMap<String, Vartype> get_members()
    {
        return this.members;
    }
    public HashMap<String, FunctionEntity> get_methods()
    {
        return this.methods;
    }
}

package utility;

import java.util.HashMap;

public abstract class Vartype
{
    String typename;
    HashMap<String, FunctionEntity> methods;
    public Vartype()
    {
        this.typename = "";
        this.methods = new HashMap<>();

    }
    public String get_typename()
    {
        return this.typename;
    }
    public static boolean is_same_type(Vartype a, Vartype b)
    {
        return a.typename.equals(b.typename);
    }
    public static boolean is_assignable(Vartype a, Vartype b)
    {
        if((a instanceof VartypeArray || a instanceof VartypeClass) && b instanceof VartypeNull)
            return true;
        else
            return is_same_type(a, b);
    }
    public boolean has_method(String method_name)
    {
        return this.methods.containsKey(method_name);
    }
    public FunctionEntity get_function_entity_with_method_name(String function_name)
    {
        if(!has_method(function_name))
            throw new Error(new Position(-1, 0), "找不到" + function_name + "方法");
        return this.methods.get(function_name);
    }
}

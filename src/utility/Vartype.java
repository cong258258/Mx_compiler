package utility;

import java.util.ArrayList;
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
        return methods.containsKey(method_name);
    }
}

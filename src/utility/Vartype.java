package utility;

import java.util.ArrayList;

public abstract class Vartype
{
    String typename;
    ArrayList<FunctionEntity> methods;
    public Vartype()
    {
        this.typename = "";
        this.methods = null;

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
        for (FunctionEntity i: methods)
            if (i.get_function_name().equals(method_name))
                return true;
        return false;
    }
}

package utility;

public abstract class Vartype
{
    String typename;
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
}

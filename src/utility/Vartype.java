package utility;

public abstract class Vartype
{
    String typename;
    public static boolean is_same_type(Vartype a, Vartype b)
    {
        return a.typename.equals(b.typename);
    }
    public boolean is_assignable(Vartype a, Vartype b)
    {
        return true;
    }
}

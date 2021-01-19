package utility;

import java.util.HashMap;

public class Scope
{
    HashMap<String, Vartype> objects;
    Scope parentScope;
    public Scope(Scope parent)
    {
        objects = new HashMap<String, Vartype>();
        this.parentScope = parent;
    }
    public void add_object(String object_name, Vartype vartp, Position pos)
    {
        if(this.objects.containsKey(object_name))
            System.out.println("Error: 作用域中变量重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
        else
            objects.put(object_name, vartp);
    }
}

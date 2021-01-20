package utility;

import java.util.HashMap;

public class Scope
{
    HashMap<String, Vartype> objects;
    Scope parent_scope;
    public Scope(Scope parent)
    {
        objects = new HashMap<>();
        this.parent_scope = parent;
    }
    public void add_object(String object_name, Vartype vartp, Position pos)
    {
        if(this.objects.containsKey(object_name))
        {
            System.out.println("Error: 作用域中变量重定义,行 " + pos.get_row() + " 列 " + pos.get_col());
            throw new Error(pos, "作用域中变量重定义");
        }
        else
            objects.put(object_name, vartp);
    }
    public boolean contain_object(String object_name, boolean look_upon)  //object.member
    {
        if (objects.containsKey(object_name))
            return true;
        else if(parent_scope != null && look_upon)
            return parent_scope.contain_object(object_name, true);
        else
            return false;
    }
    public Scope get_parent_scope()
    {
        return this.parent_scope;
    }
}

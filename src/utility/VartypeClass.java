package utility;

import java.util.HashMap;

public class VartypeClass extends Vartype
{
    String type_name;
    HashMap<String, Vartype> varname_to_vartype;
    HashMap<String, Vartype> function_name_to_function_return_type;
    public VartypeClass(String type_namee)
    {
        this.type_name = type_namee;
    }
}

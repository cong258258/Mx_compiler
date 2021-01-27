package utility;

import java.util.ArrayList;
import java.util.HashMap;

public class VartypeClass extends Vartype
{
    HashMap<String, Vartype> varname_to_vartype;
    HashMap<String, Vartype> function_name_to_function_return_type;
    public VartypeClass(String type_namee)
    {
        super.typename = type_namee;
        super.methods = new ArrayList<>();
    }
}

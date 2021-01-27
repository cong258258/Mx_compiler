package utility;

import java.util.ArrayList;

public class FunctionEntity
{
    String function_name;
    ArrayList<String> parameters;
    public FunctionEntity(String funcname, ArrayList<String> params)
    {
        this.function_name = funcname;
        this.parameters = params;
    }
    public String get_function_name()
    {
        return this.function_name;
    }
    public ArrayList<String> get_parameters()
    {
        return this.parameters;
    }
}


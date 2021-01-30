package utility;

import org.antlr.v4.runtime.misc.Pair;
import java.util.ArrayList;

public class FunctionEntity
{
    String function_name;
    Vartype return_vartype;
    ArrayList<Pair<Vartype, String>> parameters;
    Position position;
    public FunctionEntity(String funcname, Vartype vartp, ArrayList<Pair<Vartype, String>> params, Position pos)
    {
        this.function_name = funcname;
        this.return_vartype = vartp;
        this.parameters = params;
        this.position = pos;
    }
    public void set_parameters(ArrayList<Pair<Vartype, String>> params)
    {
        this.parameters = params;
    }
    public void set_return_vartype(Vartype return_vartp)
    {
        this.return_vartype = return_vartp;
    }
    public String get_function_name()
    {
        return this.function_name;
    }
    public Vartype get_return_vartype()
    {
        return this.return_vartype;
    }
    public ArrayList<Pair<Vartype, String>> get_parameters()
    {
        return this.parameters;
    }

    public Position get_position()
    {
        return this.position;
    }
}


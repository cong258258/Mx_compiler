package utility;

import frontend.SemanticChecker;
import org.antlr.v4.runtime.misc.Pair;
import java.util.ArrayList;
import java.util.HashMap;

public class VartypeString extends Vartype
{
    public VartypeString()
    {
        super.typename = "String";
        super.methods = new HashMap<>();
    }
    public void add_method(String method_name, FunctionEntity method_entity)
    {
        super.methods.put(method_name, method_entity);
    }

    public static void VartypeString_init()
    {
        ArrayList<Pair<Vartype, String>> parameters;
        FunctionEntity method;

        parameters = new ArrayList<>();
        method = new FunctionEntity("length", SemanticChecker.get_standard_vartype_int(), parameters, new Position(-1, 0));
        SemanticChecker.get_standard_vartype_string().add_method("length", method);

        parameters = new ArrayList<>();
        parameters.add(new Pair<>(new VartypeInt(), "left"));
        parameters.add(new Pair<>(new VartypeInt(), "right"));
        method = new FunctionEntity("substring", SemanticChecker.get_standard_vartype_string(), parameters, new Position(-1, 0));
        SemanticChecker.get_standard_vartype_string().add_method("substring", method);

        parameters = new ArrayList<>();
        method = new FunctionEntity("parseInt", SemanticChecker.get_standard_vartype_int(), parameters, new Position(-1, 0));
        SemanticChecker.get_standard_vartype_string().add_method("parseInt", method);

        parameters = new ArrayList<>();
        parameters.add(new Pair<>(new VartypeInt(), "pos"));
        method = new FunctionEntity("ord",SemanticChecker.get_standard_vartype_int(), parameters, new Position(-1, 0));
        SemanticChecker.get_standard_vartype_string().add_method("ord", method);
    }
}

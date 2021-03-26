package utility;

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

    public void VartypeString_init()
    {
        ArrayList<Pair<Vartype, String>> parameters;
        FunctionEntity method;

        parameters = new ArrayList<>();
        method = new FunctionEntity("length", new VartypeInt(), parameters, new Position(-1, 0));
        methods.put("length", method);

        parameters = new ArrayList<>();
        parameters.add(new Pair<>(new VartypeInt(), "left"));
        parameters.add(new Pair<>(new VartypeInt(), "right"));
        method = new FunctionEntity("substring", new VartypeString(), parameters, new Position(-1, 0));
        methods.put("substring", method);

        parameters = new ArrayList<>();
        method = new FunctionEntity("parseInt", new VartypeInt(), parameters, new Position(-1, 0));
        methods.put("parseInt", method);

        parameters = new ArrayList<>();
        parameters.add(new Pair<>(new VartypeInt(), "pos"));
        method = new FunctionEntity("ord", new VartypeInt(), parameters, new Position(-1, 0));
        methods.put("ord", method);
    }
}

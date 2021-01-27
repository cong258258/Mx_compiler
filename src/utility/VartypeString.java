package utility;

import java.util.ArrayList;

public class VartypeString extends Vartype
{
    public VartypeString()
    {
        super.typename = "String";
        super.methods = new ArrayList<>();

        ArrayList<String> parameters;
        FunctionEntity method;

        parameters = new ArrayList<>();
        method = new FunctionEntity("length", parameters);
        methods.add(method);

        parameters = new ArrayList<>();
        parameters.add("left");
        parameters.add("right");
        method = new FunctionEntity("substring", parameters);
        methods.add(method);

        parameters = new ArrayList<>();
        method = new FunctionEntity("parseInt", parameters);
        methods.add(method);

        parameters = new ArrayList<>();
        parameters.add("pos");
        method = new FunctionEntity("ord", parameters);
        methods.add(method);
    }
}

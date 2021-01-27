package utility;

import java.util.ArrayList;

public class VartypeArray extends Vartype
{
    Vartype basetype;
    int dimension;
    public VartypeArray(Vartype basetypee, int dim)
    {
        this.basetype = basetypee;
        this.dimension = dim;
        super.typename = basetypee.typename;
        super.methods = new ArrayList<>();

        ArrayList<String> parameters;
        FunctionEntity method;

        parameters = new ArrayList<>();
        method = new FunctionEntity("size", parameters);
        methods.add(method);

    }
    public Vartype get_basetype()
    {
        return this.basetype;
    }
    public int get_dimension()
    {
        return this.dimension;
    }
}

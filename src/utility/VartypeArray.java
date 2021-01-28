package utility;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class VartypeArray extends Vartype
{
    Vartype basetype;
    int dimension;
    public VartypeArray(Vartype basetypee, int dim)
    {
        this.basetype = basetypee;
        this.dimension = dim;
        super.typename = basetypee.typename;
        super.methods = new HashMap<>();

        ArrayList<Pair<Vartype, String>> parameters = new ArrayList<>();
        FunctionEntity method = new FunctionEntity("size", new VartypeInt(), parameters, new Position(-1, 0));
        methods.put("size", method);

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

package utility;

public class VartypeArray extends Vartype
{
    Vartype basetype;
    int dimension;
    public VartypeArray(Vartype basetypee, int dim)
    {
        this.basetype = basetypee;
        this.dimension = dim;
        super.typename = basetypee.typename;
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

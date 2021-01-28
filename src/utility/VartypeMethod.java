package utility;

import java.util.HashMap;

public class VartypeMethod extends Vartype
{
    Vartype master_type;
    public VartypeMethod(String typename, Vartype master_typee)
    {
        this.master_type = master_typee;
        super.typename = typename;
        super.methods = new HashMap<>();
    }

    public Vartype get_master_type()
    {
        return this.master_type;
    }
}

package utility;

import java.util.ArrayList;

public class VartypeMethod extends Vartype
{
    Vartype return_type;
    public VartypeMethod(String typename, Vartype return_typee)
    {
        this.return_type = return_typee;
        super.typename = typename;
        super.methods = new ArrayList<>();
    }
}

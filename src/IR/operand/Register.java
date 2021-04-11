package IR.operand;

import utility.IRtype;

public class Register extends Operand
{
    String name;
    public Register(IRtype tp, String namee)
    {
        super(tp);
        this.name = namee;
    }
}

package IR.operand;

import utility.IRtype;

abstract public class Operand
{
    IRtype type;
    public Operand(IRtype tp)
    {
        this.type = tp;
    }
}

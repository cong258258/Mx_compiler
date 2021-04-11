package IR.operand;

import utility.IRtype;
import utility.IRtypeInt;

public class OperandConstBool extends OperandConst
{
    boolean value;
    public OperandConstBool(boolean val)
    {
        super(new IRtypeInt(1));
        this.value = val;
    }
}

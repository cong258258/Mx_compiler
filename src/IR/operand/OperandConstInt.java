package IR.operand;

import utility.IRtype;
import utility.IRtypeInt;

public class OperandConstInt extends OperandConst
{
    int value;
    public OperandConstInt(int val)
    {
        super(new IRtypeInt(32));
        this.value = val;
    }
}

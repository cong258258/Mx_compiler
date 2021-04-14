package IR.instruction;

import IR.operand.Operand;
import utility.IRtype;

public class IRinstret extends IRinst
{
    IRtype type;
    Operand return_value;
    public IRinstret(IRtype tp, Operand val)
    {
        this.type = tp;
        this.return_value = val;
    }
}

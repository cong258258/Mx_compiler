package IR.instruction;

import IR.operand.Operand;

public class IRinststore extends IRinst
{
    Operand value;
    Operand pointer;
    public IRinststore(Operand ptr, Operand val)
    {
        this.value = val;
        this.pointer = ptr;
    }
}

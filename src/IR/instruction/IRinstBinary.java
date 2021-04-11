package IR.instruction;

import IR.operand.*;

public class IRinstBinary extends IRinst
{
    Register result;
    IROptype op;
    Operand lhs;
    Operand rhs;
    public IRinstBinary(Register res, IROptype opp, Operand l, Operand r)
    {
        this.result = res;
        this.op = opp;
        this.lhs = l;
        this.rhs = r;
    }
}

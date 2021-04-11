package IR.instruction;

import IR.operand.Operand;
import IR.operand.Register;

public class IRinstcmp extends IRinst
{
    Register result;
    IRcmptype op;
    Operand lhs;
    Operand rhs;
    public IRinstcmp(Register res, IRcmptype opp, Operand l, Operand r)
    {
        this.result = res;
        this.op = opp;
        this.lhs = l;
        this.rhs = r;
    }
}

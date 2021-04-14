package IR.instruction;

import IR.operand.Register;

public class IRinstalloca extends IRinst
{
    Register result;
    public IRinstalloca(Register res)
    {
        this.result = res;
    }
}

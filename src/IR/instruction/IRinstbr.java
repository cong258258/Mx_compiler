package IR.instruction;

import IR.Block;
import IR.operand.Operand;

public class IRinstbr extends IRinst
{
    Operand condition;
    Block todo_block;
    Block else_block;
    public IRinstbr(Operand cond, Block todo, Block elsee)
    {
        this.condition = cond;
        this.todo_block = todo;
        this.else_block = elsee;
    }
}

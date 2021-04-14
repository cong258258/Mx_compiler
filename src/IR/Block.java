package IR;

import IR.instruction.*;

public class Block
{
    String name;
    Block prev;
    Block next;
    IRinst head_inst;
    IRinst tail_inst;
    public Block(String namee)
    {
        this.name = namee;
        head_inst = new IRinstempty();
        tail_inst = new IRinstempty();
        head_inst.set_next(tail_inst);
        tail_inst.set_prev(head_inst);
    }
    public Block(String namee, Block prevv, Block nextt)
    {
        this.name = namee;
        this.prev = prevv;
        this.next = nextt;
    }
    public void add_instruction(IRinst inst)
    {
        inst.set_prev(tail_inst.get_prev());
        inst.get_prev().set_next(inst);
        tail_inst.set_prev(inst);
        inst.set_next(tail_inst);
    }
    public void set_prev(Block blk)
    {
        this.prev = blk;
    }
    public Block get_prev()
    {
        return this.prev;
    }
    public void set_next(Block blk)
    {
        this.next = blk;
    }
    public Block get_next()
    {
        return this.next;
    }
}

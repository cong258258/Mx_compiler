package IR;

import java.util.ArrayList;

public class Function
{
    String name;
    Block head_block;
    Block tail_block;
    public Function(String namee)
    {
        this.name = namee;
        this.head_block = new Block("head_empty_block", null, tail_block);
        this.tail_block = new Block("tail_empty_block", head_block, null);
    }
    public void add_block(Block blk)
    {
        blk.set_prev(tail_block.get_prev());
        blk.get_prev().set_next(blk);
        tail_block.set_prev(blk);
        blk.set_next(tail_block);
    }
}

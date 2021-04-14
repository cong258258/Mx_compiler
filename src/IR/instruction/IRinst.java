package IR.instruction;

abstract public class IRinst
{
    IRinst prev;
    IRinst next;
    public void set_prev(IRinst inst)
    {
        this.prev = inst;
    }
    public IRinst get_prev()
    {
        return this.prev;
    }
    public void set_next(IRinst inst)
    {
        this.next = inst;
    }
    public IRinst get_next()
    {
        return this.next;
    }
}

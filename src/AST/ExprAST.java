package AST;

import utility.Position;
import utility.Vartype;

public abstract class ExprAST extends AST
{
    Vartype type;
    boolean left_value;
    public ExprAST(Position positionn)
    {
        super(positionn);
        type = null;
        left_value = false;
    }
    public void set_type(Vartype typee)
    {
        this.type = typee;
    }
    public Vartype get_type()
    {
        return this.type;
    }
    public void set_left_value(boolean x)
    {
        this.left_value = x;
    }
    public boolean is_left_value()
    {
        return this.left_value;
    }
}

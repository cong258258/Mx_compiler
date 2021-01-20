package AST;

import utility.Position;
import utility.Vartype;

public abstract class ExprAST extends AST
{
    Vartype type;
    public ExprAST(Position positionn)
    {
        super(positionn);
    }
    public void set_type(Vartype typee)
    {
        this.type = typee;
    }
    public Vartype get_type()
    {
        return type;
    }
}

package AST;

import utility.Position;

public class ConstIntAST extends ConstAST
{
    int val;
    public ConstIntAST(Position positionn, int Val)
    {
        super(positionn);
        this.val = Val;
    }
    public int get_val()
    {
        return val;
    }
}

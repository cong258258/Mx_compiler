package AST;

import utility.Position;

public abstract class ExprAST extends AST
{
    int type;

    public ExprAST(Position positionn)
    {
        super(positionn);
    }
}

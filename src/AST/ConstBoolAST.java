package AST;

import utility.Position;

public class ConstBoolAST extends ConstAST
{
    boolean val;
    public ConstBoolAST(Position positionn, boolean Val)
    {
        super(positionn);
        this.val = Val;
    }
    public boolean get_val()
    {
        return val;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

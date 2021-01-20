package AST;

import utility.Position;

public class ConstNullAST extends ConstAST
{
    public ConstNullAST(Position positionn)
    {
        super(positionn);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

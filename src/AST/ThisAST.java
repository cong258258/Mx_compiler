package AST;

import utility.Position;

public class ThisAST extends ExprAST
{
    public ThisAST(Position positionn)
    {
        super(positionn);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

package AST;

import utility.Position;

public class ContinueStatementAST extends StatementAST
{
    public ContinueStatementAST(Position positionn)
    {
        super(positionn);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

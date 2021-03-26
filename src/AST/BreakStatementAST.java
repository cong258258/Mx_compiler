package AST;

import utility.Position;

public class BreakStatementAST extends StatementAST
{
    public BreakStatementAST(Position positionn)
    {
        super(positionn);
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

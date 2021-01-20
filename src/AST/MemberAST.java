package AST;

import utility.Position;

public class MemberAST extends ExprAST
{
    ExprAST exprAST;
    IdentifierExprAST identifierExprAST;
    public MemberAST(Position positionn, ExprAST ex, IdentifierExprAST id)
    {
        super(positionn);
        this.exprAST = ex;
        this.identifierExprAST = id;
    }
    public ExprAST get_ExprAST()
    {
        return this.exprAST;
    }
    public IdentifierExprAST get_IdentifierExprAST()
    {
        return this.identifierExprAST;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

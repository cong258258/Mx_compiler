package AST;

import utility.Position;

public class MemberAST extends ExprAST
{
    ExprAST exprAST;
    String member_identifier;
    public MemberAST(Position positionn, ExprAST ex, String id)
    {
        super(positionn);
        this.exprAST = ex;
        this.member_identifier = id;
    }
    public ExprAST get_ExprAST()
    {
        return this.exprAST;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

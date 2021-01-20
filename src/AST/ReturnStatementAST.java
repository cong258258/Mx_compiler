package AST;

import utility.Position;

public class ReturnStatementAST extends StatementAST
{
    ExprAST return_expr;
    public ReturnStatementAST(Position positionn, ExprAST ret)
    {
        super(positionn);
        this.return_expr = ret;
    }
    public boolean return_expr_exist()
    {
        return this.return_expr != null;
    }
    public ExprAST get_return_expr()
    {
        return this.return_expr;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

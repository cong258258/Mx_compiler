package AST;

import utility.Position;

public class ExprStatementAST extends StatementAST
{
    ExprAST expr;
    public ExprStatementAST(Position positionn, ExprAST exprr)
    {
        super(positionn);
        this.expr = exprr;
    }
    public ExprAST get_expr()
    {
        return this.expr;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

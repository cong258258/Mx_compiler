package AST;

import utility.Position;

public class IndexAST extends ExprAST
{
    ExprAST mainExprAST, indexExprAST;
    public IndexAST(Position positionn, ExprAST main, ExprAST index)
    {
        super(positionn);
        this.mainExprAST = main;
        this.indexExprAST = index;
    }
    public ExprAST get_mainExprAST()
    {
        return this.mainExprAST;
    }
    public ExprAST get_indexExprAST()
    {
        return this.indexExprAST;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

package AST;

import utility.Position;

public class UnaryPosAST extends ExprAST
{
    Optype optype;
    ExprAST exprAST;
    public UnaryPosAST(Position positionn, Optype op, ExprAST expr)
    {
        super(positionn);
        this.optype = op;
        this.exprAST = expr;
    }
    public Optype get_optype()
    {
        return this.optype;
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

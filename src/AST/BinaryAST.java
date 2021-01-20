package AST;

import utility.Position;

public class BinaryAST extends ExprAST
{
    Optype optype;
    ExprAST lhs, rhs;
    public BinaryAST(Position positionn, Optype optypee, ExprAST lhss, ExprAST rhss)
    {
        super(positionn);
        this.optype = optypee;
        this.lhs = lhss;
        this.rhs = rhss;
    }
    public Optype get_optype()
    {
        return this.optype;
    }
    public ExprAST get_lhs()
    {
        return this.lhs;
    }
    public ExprAST get_rhs()
    {
        return this.rhs;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

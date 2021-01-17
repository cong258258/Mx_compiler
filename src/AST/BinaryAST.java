package AST;

public class BinaryAST extends ExprAST
{
    public Optype optype;
    ExprAST lhs, rhs;
    BinaryAST(Optype optypee, ExprAST lhss, ExprAST rhss)
    {
        this.optype = optypee;
        this.lhs = lhss;
        this.rhs = rhss;
    }
}

package AST;

import utility.Position;

public class ConstStringAST extends ConstAST
{
    String val;
    public ConstStringAST(Position positionn, String Val)
    {
        super(positionn);
        this.val = Val;
    }
    public String get_val()
    {
        return val;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

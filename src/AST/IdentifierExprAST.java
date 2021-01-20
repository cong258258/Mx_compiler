package AST;

import utility.Position;

public class IdentifierExprAST extends ExprAST
{
    String name;
    public IdentifierExprAST(Position positionn, String Name)
    {
        super(positionn);
        this.name = Name;
    }
    public String get_name()
    {
        return this.name;
    }
}

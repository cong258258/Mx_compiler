package AST;

public class IdentifierExprAST extends ExprAST
{
    public String name;
    IdentifierExprAST(String Name)
    {
        this.name = Name;
    }
}

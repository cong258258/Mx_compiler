package AST;

import utility.Position;
import utility.Vartype;

public class VarAST extends AST
{
    TypeAST var_type;
    String var_name;
    public VarAST(Position positionn, TypeAST typee, String var_namee)
    {
        super(positionn);
        this.var_type = typee;
        this.var_name = var_namee;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

package AST;

import utility.Position;
import java.util.ArrayList;

public class VarmultidefStatementAST extends VardefStatementAST
{
    TypeAST vartype;
    ArrayList<String> identifiers;
    public VarmultidefStatementAST(Position positionn, TypeAST vartp, ArrayList<String> ids)
    {
        super(positionn);
        this.vartype = vartp;
        this.identifiers = ids;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

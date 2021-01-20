package AST;

import utility.Position;
import java.util.ArrayList;

public class VarmultidefStatementAST extends VardefStatementAST
{
    TypeAST vartype;
    ArrayList<IdentifierExprAST> identifiers;
    public VarmultidefStatementAST(Position positionn, TypeAST vartp, ArrayList<IdentifierExprAST> ids)
    {
        super(positionn);
        this.vartype = vartp;
        this.identifiers = ids;
    }
}

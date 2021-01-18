package AST;

import utility.Position;
import java.util.ArrayList;

public class VarmultidefStatementAST extends VardefStatementAST
{
    String vartype;
    ArrayList<IdentifierExprAST> identifiers = new ArrayList<IdentifierExprAST>();
    public VarmultidefStatementAST(Position positionn, String vartp, ArrayList<IdentifierExprAST> ids)
    {
        super(positionn);
        this.vartype = vartp;
        this.identifiers = ids;
    }
}

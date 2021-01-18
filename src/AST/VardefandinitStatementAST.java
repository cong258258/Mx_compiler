package AST;

import utility.Position;

public class VardefandinitStatementAST extends VardefStatementAST
{
    String vartype;
    IdentifierExprAST identifier;
    ExprAST init_expr;
    public VardefandinitStatementAST(Position positionn, String vartp, IdentifierExprAST id, ExprAST ini)
    {
        super(positionn);
        this.vartype = vartp;
        this.identifier = id;
        this.init_expr = ini;
    }
}

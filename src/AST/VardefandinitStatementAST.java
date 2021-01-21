package AST;

import utility.Position;

public class VardefandinitStatementAST extends VardefStatementAST
{
    TypeAST vartype;
    String identifier;
    ExprAST init_expr;
    public VardefandinitStatementAST(Position positionn, TypeAST vartp, String id, ExprAST ini)
    {
        super(positionn);
        this.vartype = vartp;
        this.identifier = id;
        this.init_expr = ini;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

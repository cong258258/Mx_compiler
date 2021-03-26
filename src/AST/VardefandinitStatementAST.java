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
    public TypeAST get_vartype()
    {
        return this.vartype;
    }
    public String get_identifier()
    {
        return this.identifier;
    }
    public ExprAST get_init_expr()
    {
        return this.init_expr;
    }
    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

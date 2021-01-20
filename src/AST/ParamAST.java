package AST;

import utility.Position;

public class ParamAST extends StatementAST
{
    TypeAST param_type;
    IdentifierExprAST param_name;
    public ParamAST(Position positionn, TypeAST paramtype, IdentifierExprAST paramname)
    {
        super(positionn);
        this.param_type = paramtype;
        this.param_name = paramname;
    }
}

package AST;

import utility.Position;

public class ParamAST extends StatementAST
{
    TypeAST param_type;
    String param_name;
    public ParamAST(Position positionn, TypeAST paramtype, String paramname)
    {
        super(positionn);
        this.param_type = paramtype;
        this.param_name = paramname;
    }
}

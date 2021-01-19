package AST;

import utility.Position;

import java.util.ArrayList;

public class ParamlistAST extends StatementAST
{
    ArrayList<ParamAST> param_name_list;
    public ParamlistAST(Position positionn, ArrayList<ParamAST> paramnamelist)
    {
        super(positionn);
        this.param_name_list = paramnamelist;
    }
}

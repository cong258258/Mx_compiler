package AST;

import utility.Position;

import java.util.ArrayList;

public class VarlistAST extends AST
{
    ArrayList<VarAST> var_list;
    public VarlistAST(Position positionn, ArrayList<VarAST> vlist)
    {
        super(positionn);
        this.var_list = vlist;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

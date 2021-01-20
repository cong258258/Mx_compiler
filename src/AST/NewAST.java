package AST;

import utility.Position;
import java.util.ArrayList;

public class NewAST extends ExprAST
{
    TypeAST vartype;
    int[] len;
    int dimension_with_init_len;
    int dimension_all;
    public NewAST(Position positionn, TypeAST vartp, int[] l, int dim_ini, int dim_all)
    {
        super(positionn);
        this.vartype = vartp;
        this.len = l;
        this.dimension_with_init_len = dim_ini;
        this.dimension_all = dim_all;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
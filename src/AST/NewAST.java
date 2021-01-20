package AST;

import utility.Position;
import java.util.ArrayList;

public class NewAST extends ExprAST
{
    TypeAST vartype;
    ArrayList<ExprAST> init_expr;
    int dimension_all;
    public NewAST(Position positionn, TypeAST vartp, ArrayList<ExprAST> ini, int dim_all)
    {
        super(positionn);
        this.vartype = vartp;
        this.init_expr = ini;
        this.dimension_all = dim_all;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
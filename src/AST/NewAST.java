package AST;

import utility.Position;
import utility.Vartype;

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
    public TypeAST get_vartype()
    {
        return this.vartype;
    }
    public ArrayList<ExprAST> get_init_expr()
    {
        return this.init_expr;
    }
    public int get_dimension_all()
    {
        return this.dimension_all;
    }
    public int get_demension_init()
    {
        return this.init_expr.size();
    }
    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
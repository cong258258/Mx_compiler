package AST;

import utility.Position;
import java.util.ArrayList;

public class NewAST extends ExprAST
{
    TypeAST vartype;
    ArrayList<ExprAST> init_expr;
    int cnt;
    public NewAST(Position positionn, TypeAST vartp, ArrayList<ExprAST> ini, int cntt)
    {
        super(positionn);
        this.vartype = vartp;
        this.init_expr = ini;
        this.cnt = cntt;
    }
}
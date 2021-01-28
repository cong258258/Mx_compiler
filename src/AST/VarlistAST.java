package AST;

import javafx.util.Pair;
import utility.Position;
import utility.Vartype;

import java.util.ArrayList;

public class VarlistAST extends AST
{
    ArrayList<VarAST> var_list;
    ArrayList<Pair<Vartype, String>> var_arraylist;
    public VarlistAST(Position positionn, ArrayList<VarAST> vlist)
    {
        super(positionn);
        this.var_list = vlist;
        this.var_arraylist = null;
    }

    public ArrayList<VarAST> get_var_list()
    {
        return var_list;
    }
    public ArrayList<Pair<Vartype, String>> get_var_arraylist()
    {
        return this.var_arraylist;
    }
    public void add_into_var_arraylist(Vartype vartp, String varname)
    {
        this.var_arraylist.add(new Pair<>(vartp, varname));
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

package AST;

import utility.Position;
import java.util.ArrayList;

public class ClassdefAST extends ProgramPartAST
{
    String identifier;
    ArrayList<VardefStatementAST> members;
    ArrayList<FunctiondefAST> functions;
    FunctiondefAST constructor;
    public ClassdefAST(Position positionn, String identifierr, ArrayList<VardefStatementAST> mem, ArrayList<FunctiondefAST> funcs, FunctiondefAST con)
    {
        super(positionn);
        this.identifier = identifierr;
        this.members = mem;
        this.functions = funcs;
        this.constructor = con;
    }

    public String get_identifier()
    {
        return identifier;
    }
    public ArrayList<VardefStatementAST> get_var_def_statements()
    {
        return this.members;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

package AST;

import utility.Position;
import java.util.ArrayList;

public class ClassdefAST extends ProgramPartAST
{
    String identifier;
    ArrayList<VardefStatementAST> members = new ArrayList<VardefStatementAST>();
    ArrayList<FunctiondefAST> functions = new ArrayList<FunctiondefAST>();
    FunctiondefAST constructor;
    public ClassdefAST(Position positionn, String identifierr, ArrayList<VardefStatementAST> mem, ArrayList<FunctiondefAST> funcs, FunctiondefAST con)
    {
        super(positionn);
        this.identifier = identifierr;
        this.members = mem;
        this.functions = funcs;
        this.constructor = con;
    }
}

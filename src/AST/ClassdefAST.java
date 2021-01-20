package AST;

import utility.Position;
import java.util.ArrayList;

public class ClassdefAST extends ProgramPartAST
{
    String identifier;
    ArrayList<VarmultidefStatementAST> members;
    ArrayList<FunctiondefAST> functions;
    FunctiondefAST constructor;
    public ClassdefAST(Position positionn, String identifierr, ArrayList<VarmultidefStatementAST> mem, ArrayList<FunctiondefAST> funcs, FunctiondefAST con)
    {
        super(positionn);
        this.identifier = identifierr;
        this.members = mem;
        this.functions = funcs;
        this.constructor = con;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

package AST;

import utility.Position;
import java.util.ArrayList;

public class FunctiondefAST extends ProgramPartAST
{
    String return_vartype;
    String function_name;
    ArrayList<VarmultidefStatementAST> params = new ArrayList<VarmultidefStatementAST>();
    StatementAST statements;
    public FunctiondefAST(Position positionn, String retvartp, String funcname, ArrayList<VarmultidefStatementAST> pa, StatementAST sts)
    {
        super(positionn);
        this.return_vartype = retvartp;
        this.function_name = funcname;
        this.params = pa;
        this.statements = sts;
    }
}
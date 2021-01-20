package AST;

import utility.Position;
import java.util.ArrayList;

public class FunctiondefAST extends ProgramPartAST
{
    TypeAST return_vartype;
    String function_name;
    ParamlistAST params;
    StatementAST statements;
    public FunctiondefAST(Position positionn, TypeAST retvartp, String funcname, ParamlistAST pa, StatementAST sts)
    {
        super(positionn);
        this.return_vartype = retvartp;
        this.function_name = funcname;
        this.params = pa;
        this.statements = sts;
    }
}
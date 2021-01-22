package AST;

import utility.Position;

import java.util.ArrayList;

public class GlobalVardefAST extends ProgramPartAST
{
    ArrayList<VardefStatementAST> vardef_statements;
    public GlobalVardefAST(Position positionn, ArrayList<VardefStatementAST> vardefstmts)
    {
        super(positionn);
        this.vardef_statements = vardefstmts;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {

    }
}

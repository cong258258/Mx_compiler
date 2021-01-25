package AST;

import utility.Position;

import java.util.ArrayList;

public class GlobalVardefAST extends ProgramPartAST
{
    VardefStatementAST vardef_statements;
    public GlobalVardefAST(Position positionn, VardefStatementAST vardefstmts)
    {
        super(positionn);
        this.vardef_statements = vardefstmts;
    }
    public VardefStatementAST get_vardef_statements()
    {
        return this.vardef_statements;
    }
    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

package AST;

import utility.Position;
import java.util.ArrayList;

public class ProgramAST extends AST
{
    ArrayList<ProgramPartAST> program_parts;
    ArrayList<VardefStatementAST> program_var_def;
    public ProgramAST(Position positionn, ArrayList<ProgramPartAST> progparts, ArrayList<VardefStatementAST> progvardef)
    {
        super(positionn);
        this.program_parts = progparts;
        this.program_var_def = progvardef;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

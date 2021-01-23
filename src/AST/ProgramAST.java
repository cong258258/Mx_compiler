package AST;

import utility.Position;
import java.util.ArrayList;

public class ProgramAST extends AST
{
    ArrayList<ProgramPartAST> program_parts;
    public ProgramAST(Position positionn, ArrayList<ProgramPartAST> progparts)
    {
        super(positionn);
        this.program_parts = progparts;
    }

    public ArrayList<ProgramPartAST> get_program_parts()
    {
        return this.program_parts;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

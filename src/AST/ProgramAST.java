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
}

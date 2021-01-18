package AST;

import utility.Position;

public class ClassdefAST extends ProgramPartAST
{
    String identifier;
    public ClassdefAST(Position positionn, String identifierr)
    {
        super(positionn);
        this.identifier = identifierr;
    }
}

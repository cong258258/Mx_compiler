package AST;

import utility.Position;

public class TypeAST extends AST
{
    String typename;
    public TypeAST(Position positionn, String typenamee)
    {
        super(positionn);
        this.typename = typenamee;
    }
}
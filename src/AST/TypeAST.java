package AST;

import utility.Position;

public abstract class TypeAST extends AST
{
    public TypeAST(Position positionn)
    {
        super(positionn);
    }
    public abstract String get_typename();
    public abstract int get_dimension();
}

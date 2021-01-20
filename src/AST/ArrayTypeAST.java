package AST;

import utility.Position;

public class ArrayTypeAST extends AST
{
    String typename;
    int dimension;
    public ArrayTypeAST(Position positionn, String typenamee, int dim)
    {
        super(positionn);
        this.typename = typenamee;
        this.dimension = dim;
    }
}

package AST;

import utility.Position;

public class ArrayTypeAST extends TypeAST
{
    String typename;
    int dimension;
    public ArrayTypeAST(Position positionn, String typenamee, int dim)
    {
        super(positionn);
        this.typename = typenamee;
        this.dimension = dim;
    }
    public String get_typename()
    {
        return this.typename;
    }
    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

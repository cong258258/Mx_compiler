package AST;

import utility.Position;

public class SingleTypeAST extends TypeAST
{
    String typename;
    public SingleTypeAST(Position positionn, String typenamee)
    {
        super(positionn);
        this.typename = typenamee;
    }
    public String get_typename()
    {
        return this.typename;
    }
    public int get_dimension()
    {
        return 0;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

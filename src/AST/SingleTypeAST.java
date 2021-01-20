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

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

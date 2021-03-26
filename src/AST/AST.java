package AST;
import utility.Position;

public abstract class AST
{
    Position position;
    public AST(Position positionn)
    {
        this.position = positionn;
    }
    public Position get_position()
    {
        return position;
    }
    abstract public void accept(ASTVisitor visitor);
}
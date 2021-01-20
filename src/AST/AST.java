package AST;
import utility.Position;

public abstract class AST
{
    Position position;
    public AST(Position positionn)
    {
        this.position = positionn;
    }
    abstract public void accept(ASTVisitor visitor);
}
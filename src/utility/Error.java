package utility;

public class Error extends java.lang.Error
{
    Position pos;
    String msg;
    public Error(Position poss, String msgg)
    {
        this.pos = poss;
        this.msg = msgg;
    }
}

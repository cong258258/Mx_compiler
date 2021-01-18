package utility;

public class Position
{
    private int row, col;
    public Position(int Row, int Col)
    {
        this.row = Row;
        this.col = Col;
    }
    public int row()
    {
        return this.row;
    }
    public int col()
    {
        return this.col;
    }
}
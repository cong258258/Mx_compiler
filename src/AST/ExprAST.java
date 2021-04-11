package AST;

import IR.operand.Operand;
import utility.Position;
import utility.Vartype;

public abstract class ExprAST extends AST
{
    Vartype type;
    boolean left_value;
    Operand left_value_operand;
    Operand right_value_operand;
    public ExprAST(Position positionn)
    {
        super(positionn);
        type = null;
        left_value = false;
    }
    public void set_type(Vartype typee)
    {
        this.type = typee;
    }
    public Vartype get_type()
    {
        return this.type;
    }
    public void set_left_value(boolean x)
    {
        this.left_value = x;
    }
    public boolean is_left_value()
    {
        return this.left_value;
    }
    public void set_right_value_operand(Operand opr)
    {
        this.right_value_operand = opr;
    }
    public Operand get_right_value_operand()
    {
        return this.right_value_operand;
    }
    public void set_left_value_operand(Operand opr)
    {
        this.left_value_operand = opr;
    }
    public Operand get_left_value_operand()
    {
        return this.left_value_operand;
    }
}

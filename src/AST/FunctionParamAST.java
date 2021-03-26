package AST;

import utility.Position;
import java.util.ArrayList;

public class FunctionParamAST extends ExprAST
{
    ExprAST function_name;
    ArrayList<ExprAST> params;
    public FunctionParamAST(Position positionn, ExprAST funcname, ArrayList<ExprAST> pa)
    {
        super(positionn);
        this.function_name = funcname;
        this.params = pa;
    }
    public ExprAST get_function_name()
    {
        return this.function_name;
    }
    public ArrayList<ExprAST> get_params()
    {
        return this.params;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

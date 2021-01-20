package AST;

import utility.Position;

public class ForStatementAST extends StatementAST
{
    ExprAST init;
    int init_status;
    ExprAST condition;
    int condition_status;
    ExprAST update;
    int update_status;
    StatementAST todo_statement;
    public ForStatementAST(Position positionn, ExprAST a, ExprAST b, ExprAST c, StatementAST t)
    {
        super(positionn);
        if(a != null)
            this.init_status = 1;
        else
            this.init_status = 0;
        if(b != null)
            this.condition_status = 1;
        else
            this.condition_status = 0;
        if(c != null)
            this.update_status = 1;
        else
            this.update_status = 0;
        this.init = a;
        this.condition = b;
        this.update = c;
        this.todo_statement = t;
    }
    public int init_exist()
    {
        return this.init_status;
    }
    public ExprAST get_init()
    {
        return this.init;
    }
    public int condition_exist()
    {
        return this.condition_status;
    }
    public ExprAST get_condition()
    {
        return this.condition;
    }
    public int update_exist()
    {
        return this.update_status;
    }
    public ExprAST get_update()
    {
        return this.update;
    }
    public StatementAST get_todo_statement()
    {
        return this.todo_statement;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

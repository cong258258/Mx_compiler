package AST;

import utility.Position;

public class ForStatementAST extends StatementAST
{
    StatementAST init;
    int init_status;
    ExprAST condition;
    int condition_status;
    StatementAST update;
    int update_status;
    StatementAST todo_statement;
    public ForStatementAST(Position positionn, StatementAST a, ExprAST b, StatementAST c, StatementAST t)
    {
        super(positionn);
        if(a != null)
        {
            this.init_status = 1;
            this.init = a;
        }
        else
            this.init_status = 0;
        if(b != null)
        {
            this.condition_status = 1;
            this.condition = b;
        }
        else
            this.condition_status = 0;
        if(c != null)
        {
            this.update_status = 1;
            this.update = c;
        }
        else
            this.update_status = 0;
        this.todo_statement = t;
    }
    public int init_exist()
    {
        return this.init_status;
    }
    public StatementAST get_init()
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
    public StatementAST get_update()
    {
        return this.update;
    }
    public StatementAST get_todo_statement()
    {
        return this.todo_statement;
    }
}

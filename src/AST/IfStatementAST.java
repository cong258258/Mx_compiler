package AST;

import utility.Position;

public class IfStatementAST extends StatementAST
{
    ExprAST condition;
    StatementAST todo_statement, else_statement;
    int else_statement_status;
    public IfStatementAST(Position positionn, ExprAST cond, StatementAST todo, StatementAST elsee)
    {
        super(positionn);
        this.condition = cond;
        this.todo_statement = todo;
        if(else_statement != null)
        {
            else_statement_status = 1;
            this.else_statement = elsee;
        }
        else
            else_statement_status = 0;
    }
    public ExprAST get_condition()
    {
        return this.condition;
    }
    public StatementAST get_todo_statement()
    {
        return this.todo_statement;
    }
    public int else_statement_exist()
    {
        return this.else_statement_status;
    }
    public StatementAST get_else_statement()
    {
        return this.else_statement;
    }
}

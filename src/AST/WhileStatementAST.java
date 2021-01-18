package AST;

import utility.Position;

public class WhileStatementAST extends StatementAST
{
    ExprAST condition;
    StatementAST todo_statement;
    public WhileStatementAST(Position positionn, ExprAST cond, StatementAST todo)
    {
        super(positionn);
        this.condition = cond;
        this.todo_statement = todo;
    }
    public ExprAST get_condition()
    {
        return this.condition;
    }
    public StatementAST get_todo_statement()
    {
        return this.todo_statement;
    }
}

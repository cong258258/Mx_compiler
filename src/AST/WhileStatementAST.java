package AST;

import utility.Position;

public class WhileStatementAST extends StatementAST
{
    ExprAST condition;
    boolean todo_statement_status;
    StatementAST todo_statement;
    public WhileStatementAST(Position positionn, ExprAST cond, StatementAST todo)
    {
        super(positionn);
        this.condition = cond;
        if(todo != null)
        {
            this.todo_statement = todo;
            this.todo_statement_status = true;
        }
        else
            this.todo_statement_status = false;
    }
    public ExprAST get_condition()
    {
        return this.condition;
    }
    public boolean todo_statement_exist()
    {
        return this.todo_statement_status;
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

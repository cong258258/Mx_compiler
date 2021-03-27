package AST;

import utility.Position;

public class ForStatementAST extends StatementAST
{
    ExprAST init;
    boolean init_status;
    ExprAST condition;
    boolean condition_status;
    ExprAST update;
    boolean update_status;
    StatementAST todo_statement;
    boolean todo_statement_status;
    public ForStatementAST(Position positionn, ExprAST a, ExprAST b, ExprAST c, StatementAST t)
    {
        super(positionn);
        this.init_status = (a != null);
        this.condition_status = (b != null);
        this.update_status = (c != null);
        this.todo_statement_status = (t != null);
        this.init = a;
        this.condition = b;
        this.update = c;
        this.todo_statement = t;
    }
    public boolean init_exist()
    {
        return this.init_status;
    }
    public ExprAST get_init()
    {
        return this.init;
    }
    public boolean condition_exist()
    {
        return this.condition_status;
    }
    public ExprAST get_condition()
    {
        return this.condition;
    }
    public boolean update_exist()
    {
        return this.update_status;
    }
    public ExprAST get_update()
    {
        return this.update;
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

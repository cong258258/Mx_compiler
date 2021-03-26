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
    public ForStatementAST(Position positionn, ExprAST a, ExprAST b, ExprAST c, StatementAST t)
    {
        super(positionn);
        if(a != null)
            this.init_status = true;
        else
            this.init_status = false;
        if(b != null)
            this.condition_status = true;
        else
            this.condition_status = false;
        if(c != null)
            this.update_status = true;
        else
            this.update_status = false;
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

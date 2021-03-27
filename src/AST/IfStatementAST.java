package AST;

import utility.Position;

public class IfStatementAST extends StatementAST
{
    ExprAST condition;
    StatementAST todo_statement, else_statement;
    boolean else_statement_status;
    public IfStatementAST(Position positionn, ExprAST cond, StatementAST todo, StatementAST elsee)
    {
        super(positionn);
//        System.out.println(cond + " " + todo + " " + elsee);
        this.condition = cond;
        this.todo_statement = todo;
        if(elsee != null)
        {
            else_statement_status = true;
            this.else_statement = elsee;
        }
        else
            else_statement_status = false;
    }
    public ExprAST get_condition()
    {
        return this.condition;
    }
    public StatementAST get_todo_statement()
    {
        return this.todo_statement;
    }
    public boolean else_statement_exist()
    {
        return this.else_statement_status;
    }
    public StatementAST get_else_statement()
    {
        return this.else_statement;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

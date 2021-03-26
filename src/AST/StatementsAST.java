package AST;

import utility.Position;

import java.util.ArrayList;

public class StatementsAST extends StatementAST
{
    ArrayList<StatementAST> statements;
    public StatementsAST(Position positionn, ArrayList<StatementAST> stmts)
    {
        super(positionn);
        this.statements = stmts;
    }
    public ArrayList<StatementAST> get_statements()
    {
        return this.statements;
    }
    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}

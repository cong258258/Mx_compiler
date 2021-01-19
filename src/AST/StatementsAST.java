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
}

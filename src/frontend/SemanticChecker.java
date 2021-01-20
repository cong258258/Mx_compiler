package frontend;

import AST.*;
import utility.Error;
import utility.Scope;
import static AST.Optype.*;

public class SemanticChecker implements ASTVisitor
{
    Scope scope;
    public SemanticChecker(Scope scopee)
    {
        this.scope = scopee;
    }
    @Override
    public void visit(ProgramAST AST)
    {

    }

    @Override
    public void visit(TypeAST AST)
    {

    }

    @Override
    public void visit(ArrayTypeAST AST)
    {

    }

    @Override
    public void visit(ClassdefAST AST)
    {

    }

    @Override
    public void visit(ParamlistAST AST)
    {

    }

    @Override
    public void visit(ParamAST AST)
    {

    }

    @Override
    public void visit(ExprStatementAST AST)
    {

    }

    @Override
    public void visit(ContinueStatementAST AST)
    {

    }

    @Override
    public void visit(BreakStatementAST AST)
    {

    }

    @Override
    public void visit(ReturnStatementAST AST)
    {

    }

    @Override
    public void visit(WhileStatementAST AST)
    {

    }

    @Override
    public void visit(ForStatementAST AST)
    {

    }

    @Override
    public void visit(IfStatementAST AST)
    {

    }

    @Override
    public void visit(VarmultidefStatementAST AST)
    {

    }

    @Override
    public void visit(VardefandinitStatementAST AST)
    {

    }

    @Override
    public void visit(StatementsAST AST)
    {

    }

    @Override
    public void visit(ThisAST AST)
    {

    }

    @Override
    public void visit(NewAST AST)
    {

    }

    @Override
    public void visit(BinaryAST AST)
    {
        AST.get_lhs().accept(this);
        AST.get_rhs().accept(this);
        if(AST.get_optype() == op_empty)
            throw new Error(AST.get_position(), "op empty unknown error");
//        else if(AST.get_optype() == )
    }

    @Override
    public void visit(UnaryPosAST AST)
    {

    }

    @Override
    public void visit(UnaryPreAST AST)
    {

    }

    @Override
    public void visit(FunctionParamAST AST)
    {

    }

    @Override
    public void visit(IndexAST AST)
    {

    }

    @Override
    public void visit(MemberAST AST)
    {

    }

    @Override
    public void visit(IdentifierExprAST AST)
    {

    }

    @Override
    public void visit(ConstNullAST AST) {}

    @Override
    public void visit(ConstStringAST AST){}

    @Override
    public void visit(ConstBoolAST AST){}

    @Override
    public void visit(ConstIntAST AST){}

    @Override
    public void visit(FunctiondefAST AST)
    {
    }
}

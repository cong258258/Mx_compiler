package AST;
public interface ASTVisitor
{
    void visit(ProgramAST AST);

    void visit(VarAST AST);
    void visit(VarlistAST AST);

    void visit(SingleTypeAST AST);
    void visit(ArrayTypeAST AST);

    void visit(ClassdefAST AST);
    void visit(FunctiondefAST AST);
    void visit(GlobalVardefAST AST);

    void visit(ConstIntAST AST);
    void visit(ConstBoolAST AST);
    void visit(ConstStringAST AST);
    void visit(ConstNullAST AST);
    void visit(IdentifierExprAST AST);
    void visit(MemberAST AST);
    void visit(IndexAST AST);
    void visit(FunctionParamAST AST);
    void visit(UnaryPreAST AST);
    void visit(UnaryPosAST AST);
    void visit(BinaryAST AST);
    void visit(NewAST AST);
    void visit(ThisAST AST);

    void visit(StatementsAST AST);
    void visit(VardefandinitStatementAST AST);
    void visit(VarmultidefStatementAST AST);
    void visit(IfStatementAST AST);
    void visit(ForStatementAST AST);
    void visit(WhileStatementAST AST);
    void visit(ReturnStatementAST AST);
    void visit(BreakStatementAST AST);
    void visit(ContinueStatementAST AST);
    void visit(ExprStatementAST AST);

}

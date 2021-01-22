package AST;

import utility.Position;

public class FunctiondefAST extends ProgramPartAST
{
    TypeAST return_vartype;
    String function_name;
    VarlistAST params;
    StatementAST statements;
    public FunctiondefAST(Position positionn, TypeAST retvartp, String funcname, VarlistAST pa, StatementAST sts)
    {
        super(positionn);
        this.return_vartype = retvartp;
        this.function_name = funcname;
        this.params = pa;
        this.statements = sts;
    }

    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
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
    public String get_function_name()
    {
        return this.function_name;
    }
    public TypeAST get_return_vartype()
    {
        return this.return_vartype;
    }
    public VarlistAST get_params()
    {
        return this.params;
    }
    public StatementAST get_statements()
    {
        return this.statements;
    }
    @Override
    public void accept(ASTVisitor visitor)
    {
        visitor.visit(this);
    }
}
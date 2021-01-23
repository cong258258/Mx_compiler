# Mx_compiler
<b>java org.antlr.v4.Tool -visitor .\Mx.g4</b>

package parser



<h2>AST树节点设计</h2>

（层级表示派生）

- **AST**
  - **VarAST**
  - **VarlistAST**
  - **TypeAST**
    - **SingleTypeAST**
    - **ArrayTypeAST**
  - **ProgramAST**
    - **ProgramPartAST**
      - **ClassdefAST**
      - **FunctiondefAST**
      - **GlobalVardefAST**
  - **ExprAST**
    - **ConstAST**
      - **ConstIntAST**
      - **ConstBoolAST**
      - **ConstStringAST**
      - **ConstNullAST**
    - **IdentifierExprAST**
    - **MemberAST**      .
    - **IndexAST**      []
    - **FunctionParamAST**   gcd(6,8)
    - **UnaryPreAST**  前缀++
    - **UnaryPosAST** 后缀++
    - **BinaryAST**
    - **NewAST**
    - **ThisAST**
  - **StatementAST**
    - **StatementsAST**
    - **VardefStatementAST**
      - **VardefandinitStatementAST**
      - **VarmultidefStatementAST**
    - **IfStatementAST**
    - **ForStatementAST**
    - **WhileStatementAST**
    - **ReturnStatementAST**
    - **BreakStatementAST**
    - **ContinueStatementAST**
    - **ExprStatementAST**
    - //**ParamAST**
    - //**ParamlistAST**



- void visit(ProgramAST AST);

- void visit(VarAST AST);
  
- void visit(VarlistAST AST);
  
-   void visit(SingleTypeAST AST);
  
- void visit(ArrayTypeAST AST);

- **void visit(ClassdefAST AST);**

- **void visit(FunctiondefAST AST);**

  

- void visit(ConstIntAST AST);

- void visit(ConstBoolAST AST);

- void visit(ConstStringAST AST);

- void visit(ConstNullAST AST);

- void visit(IdentifierExprAST AST);

- **void visit(MemberAST AST);**

- **void visit(IndexAST AST);**

- **void visit(FunctionParamAST AST);**

- void visit(UnaryPreAST AST);

- void visit(UnaryPosAST AST);

- void visit(BinaryAST AST); 

- **void visit(NewAST AST);**

- **void visit(ThisAST AST);**

  

- **void visit(StatementsAST AST);**

- **void visit(VardefandinitStatementAST AST);**

- **void visit(VarmultidefStatementAST AST);**

- **void visit(IfStatementAST AST);**

- **void visit(ForStatementAST AST);**

- **void visit(WhileStatementAST AST);**

- **void visit(ReturnStatementAST AST);**

- **void visit(BreakStatementAST AST);**

- **void visit(ContinueStatementAST AST);**

- **void visit(ExprStatementAST AST);**

- **void visit(ParamAST AST);**

- **void visit(ParamlistAST AST);**

  


int a = new int()()


<h2>AST builder</h2>

- **visitConstant**
- **visitExpression_list**    //空
- **visitNew**     //直接到malloc
- **visitUnaryPre**
- **visitUnaryPos**
- **visitIdentifierExpr**
- **visitConst** 
- **visitThis**
- **visitIndex**
- **visitBinary**
- **visitMember**
- **visitFunctionParam**   ???
- **visitVar_multi_def**
- **visitVar_def_and_init**
- **visitVar_def**
- **visitVar_malloc**
- **visitVardefStatement**
- **visitStatements**
- **visitIfStatement**
- **visitForStatement**
- **visitWhileStatement**
- **visitReturnStatement**
- **visitBreakStatement**
- **visitContinueStatement**
- **visitExprStatement**
- **visitProgram**
- **visitProgram_part**
- **visitType**
- **visitClass_def**   ？？？
- **visitParam**
- **visitParamlist**
- **visitFunc_def**

（todoblock）
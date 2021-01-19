# Mx_compiler
<b>java org.antlr.v4.Tool -visitor .\Mx.g4</b>

package parser



<h2>AST树节点设计</h2>

（层级表示派生）

- **AST**

  - **TypeAST**
- **ProgramAST**
  - **ProgramPartAST**
    - **ClassdefAST**
    - **FunctiondefAST**
  - GlobalVardefAST   ????
  
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
  
      - **VardefandinitStatementAST**;
      - **VarmultidefStatementAST**;
    - **IfStatementAST**
    - **ForStatementAST**
    - **WhileStatementAST**
    - **ReturnStatementAST**
    - **BreakStatementAST**
      
    - **ContinueStatementAST**
    - **ExprStatementAST**
  
  

int a = new int()()



<h2>AST builder</h2>

- **visitExpression_list**    //空
- visitNew
- **visitUnaryPre**
- **visitUnaryPos**
- visitIdentifierExpr
- visitConst   ???
- **visitThis**
- **visitIndex**
- **visitBinary**
- **visitMember**
- **visitFunctionParam**   ???
- visitVar_multi_def
- visitVar_def_and_init
- visitVar_def
- visitVar_malloc
- visitVardefStatement
- visitStatements
- **visitIfStatement**
- **visitForStatement**
- **visitWhileStatement**
- **visitReturnStatement**
- **visitBreakStatement**
- **visitContinueStatement**
- **visitExprStatement**
- **visitProgram**
- **visitProgram_part**
- visitType
- visitClass_def
- visitParam
- visitParamlist
- visitFunc_def
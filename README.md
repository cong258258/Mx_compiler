# Mx_compiler
Mx_compiler



<b>java org.antlr.v4.Tool -visitor .\Mx.g4</b>

package parser



<h2>AST树节点设计</h2>

（层级表示派生）

- **AST**

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

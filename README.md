# Mx_compiler
Mx_compiler



<h2>AST树节点设计</h2>

（层级表示派生）

- AST

  - ProgramPartAST

    - ClassdefAST
    - FunctiondefAST
    - GlobalVardefAST

  - ExprAST
  	
  	- ConstAST
  	  - ConstIntAST
  	  - ConstBoolAST
  	  - ConstStringAST
  	  - ConstNullAST
  	- IdentifierExprAST
  	- MemberAST      .
  	- IndexAST      []
  	- FunctionParamAST   gcd(6,8)
  	- UnaryPreAST  前缀++
  	- UnaryPosAST 后缀++
  	- BinaryAST
  	
  - StatementAST

    - StatementsAST

    - VardefStatementAST

    - IfStatementAST

    - ForStatementAST

    - WhileStatementAST

    - ReturnStatementAST

    - BreakStatementAST

    - ContinueStatementAST

    - ExprStatementAST

      



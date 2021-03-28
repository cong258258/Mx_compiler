import AST.ProgramAST;
import frontend.ASTBuilder;
import frontend.SemanticChecker;
import utility.Error;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import parser.MxLexer;
import parser.MxParser;
import utility.MxErrorListener;


public class Mxcompiler
{
    public static void main(String[] args) throws IOException
    {
//        File file = new File("testcases/class-9.mx");
//        FileInputStream file_input_stream = new FileInputStream(file);
        InputStream file_input_stream = System.in;
        CharStream filename_charstream = CharStreams.fromStream(file_input_stream);
        try
        {
            MxLexer mx_lexer = new MxLexer(filename_charstream);
            mx_lexer.removeErrorListeners();
            mx_lexer.addErrorListener(new MxErrorListener());
            CommonTokenStream mx_token_stream = new CommonTokenStream(mx_lexer);
            MxParser mx_parser = new MxParser(mx_token_stream);
            mx_parser.removeErrorListeners();
            mx_parser.addErrorListener(new MxErrorListener());
            ParseTree mx_parse_tree_root = mx_parser.program();
            ASTBuilder mx_ASTBuilder = new ASTBuilder();
            ProgramAST mx_AST_root = (ProgramAST) mx_ASTBuilder.visit(mx_parse_tree_root);
            SemanticChecker mx_semantic_checker = new SemanticChecker();
            mx_AST_root.accept(mx_semantic_checker);
        }
        catch(Error mx_semantic_error)
        {
            mx_semantic_error.show_error();
            throw new RuntimeException();
        }
    }
}
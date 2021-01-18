import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import parser.MxLexer;
import parser.MxParser;


public class Mxcompiler
{
    public static void main(String args[]) throws IOException
    {
        File file = new File("1.in");
        FileInputStream file_input_stream = new FileInputStream(file);
        CharStream filename_charstream = CharStreams.fromStream(file_input_stream);
        MxLexer mx_lexer = new MxLexer(filename_charstream);
        CommonTokenStream mx_token_stream = new CommonTokenStream(mx_lexer);
        MxParser mx_parser = new MxParser(mx_token_stream);
        ParseTree parse_tree_root = mx_parser.program();
    }
}
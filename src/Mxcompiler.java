import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Mxcompiler
{
    public static void main(String args[])
    {
        String filename = new String("1.in");
//        try
//        {
//            InputStream f = new FileInputStream(filename);
//            System.out.println(f.read());
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
        CharStream filename_charstream = CharStreams.fromString(filename);
        MxLexer mx_lexer = new MxLexer(filename_charstream);
        CommonTokenStream mx_token_stream = new CommonTokenStream(mx_lexer);
        MxParser mx_parser = new MxParser(mx_token_stream);
        ParseTree parse_tree_root = mx_parser.program();
    }
}
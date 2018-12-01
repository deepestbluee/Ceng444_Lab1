import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Application 
{
	public static void main(String[] args) throws Exception 
	{

		ANTLRInputStream input = new ANTLRInputStream(System.in);
		XPLNLexer lexer = new XPLNLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		XPLNParser parser = new XPLNParser(tokens);
		ParseTree tree = parser.start(); 
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new MyListener(), tree);
		System.out.println(); 
	}
}

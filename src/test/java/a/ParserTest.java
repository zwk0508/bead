package a;

import com.zwk.node.Node;
import com.zwk.parser.BeadParser;
import com.zwk.parser.ParseException;

import java.io.StringReader;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/19 16:08
 */

public class ParserTest {
    public static void main(String[] args) throws ParseException {
        String s = getScript();
        BeadParser beadParser = new BeadParser(new StringReader(s));
        Node root = beadParser.root();
        System.out.println("root = " + root);
    }

    private static String getScript(){
        return "var a = 10 var b = 10 var c = 20 var d d = a print(a,b,c,d)";
    }
}

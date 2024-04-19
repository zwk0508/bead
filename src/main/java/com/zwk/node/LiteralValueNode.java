package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:06
 */

public class LiteralValueNode extends BaseNode {

    public int parseInt(String t) {
        if (t.startsWith("0x") || t.startsWith("0X")) {
            return Integer.parseInt(t, 16);
        }
        if (t.startsWith("0")) {
            return Integer.parseInt(t, 8);
        }
        return Integer.parseInt(t);
    }
    public String parseString(String t) {
        t = t.substring(1, t.length() - 1);
       return t.replace("\\n", "\n")
               .replace("\\t","\t")
               .replace("\\b","\b")
               .replace("\\r","\r")
               .replace("\\f","\f")
               .replace("\\\\","\\")
               .replace("\\'","'")
               ;
    }

}

package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:52
 */

public class VarNode extends BaseNode {
    public String name;
    public Node value;
    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitVar(this, c);
    }
}

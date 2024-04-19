package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:55
 */

public class AssignNode extends BaseNode{

    public String name;
    public String operator;

    public Node value;

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitAssign(this, c);
    }
}

package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:56
 */

public class ValueNode extends BaseNode {
    private Node value;

    public Node getValue() {
        return value;
    }

    public void setValue(Node value) {
        this.value = value;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitValue(this, c);
    }
}

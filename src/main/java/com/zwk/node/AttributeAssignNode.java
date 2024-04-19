package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 16:57
 */

public class AttributeAssignNode extends BaseNode{
    private Node attribute;

    private Node value;

    public Node getAttribute() {
        return attribute;
    }

    public void setAttribute(Node attribute) {
        this.attribute = attribute;
    }

    public Node getValue() {
        return value;
    }

    public void setValue(Node value) {
        this.value = value;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitAttributeAssign(this, c);
    }
}

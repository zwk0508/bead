package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:59
 */

public class AttributeValueNode extends BaseNode{
    private Node attribute;

    public Node getAttribute() {
        return attribute;
    }

    public void setAttribute(Node attribute) {
        this.attribute = attribute;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitAttributeValue(this, c);
    }
}

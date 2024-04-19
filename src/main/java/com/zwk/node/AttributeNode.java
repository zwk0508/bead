package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:59
 */

public class AttributeNode extends BaseNode{

    private String name;

    private List<Node> attributeValues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getAttributeValues() {
        return attributeValues;
    }

    public void setAttributeValues(List<Node> attributeValues) {
        this.attributeValues = attributeValues;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitAttribute(this, c);
    }
}

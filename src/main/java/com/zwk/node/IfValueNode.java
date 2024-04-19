package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:20
 */

public class IfValueNode extends BaseNode{

    private Node value;

    private Node logicValue;

    private Node elseValue;

    public Node getValue() {
        return value;
    }

    public void setValue(Node value) {
        this.value = value;
    }

    public Node getLogicValue() {
        return logicValue;
    }

    public void setLogicValue(Node logicValue) {
        this.logicValue = logicValue;
    }

    public Node getElseValue() {
        return elseValue;
    }

    public void setElseValue(Node elseValue) {
        this.elseValue = elseValue;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitIfValue(this, c);
    }
}

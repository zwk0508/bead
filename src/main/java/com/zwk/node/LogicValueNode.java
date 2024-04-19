package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:07
 */

public class LogicValueNode extends BaseNode{
    private Node priorityLogicValue;

    private List<Node> priorityLogicValues;

    public Node getPriorityLogicValue() {
        return priorityLogicValue;
    }

    public void setPriorityLogicValue(Node priorityLogicValue) {
        this.priorityLogicValue = priorityLogicValue;
    }

    public List<Node> getPriorityLogicValues() {
        return priorityLogicValues;
    }

    public void setPriorityLogicValues(List<Node> priorityLogicValues) {
        this.priorityLogicValues = priorityLogicValues;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitLogicValue(this, c);
    }
}

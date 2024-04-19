package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:08
 */

public class PriorityLogicValueNode extends BaseNode{

    private Node priorityBaseLogicValue;

    private List<Node> priorityBaseLogicValues;

    public Node getPriorityBaseLogicValue() {
        return priorityBaseLogicValue;
    }

    public void setPriorityBaseLogicValue(Node priorityBaseLogicValue) {
        this.priorityBaseLogicValue = priorityBaseLogicValue;
    }

    public List<Node> getPriorityBaseLogicValues() {
        return priorityBaseLogicValues;
    }

    public void setPriorityBaseLogicValues(List<Node> priorityBaseLogicValues) {
        this.priorityBaseLogicValues = priorityBaseLogicValues;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitPriorityLogicValue(this, c);
    }
}

package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:35
 */

public class ReturnStatementNode extends BaseNode {
    private List<Node> values;

    public List<Node> getValues() {
        return values;
    }

    public void setValues(List<Node> values) {
        this.values = values;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitReturnStatement(this, c);
    }
}

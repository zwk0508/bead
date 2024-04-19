package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:26
 */

public class StatementNode extends BaseNode {

    private Node statement;

    public Node getStatement() {
        return statement;
    }

    public void setStatement(Node statement) {
        this.statement = statement;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitStatement(this, c);
    }
}

package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:29
 */

public class BlockStatementNode extends BaseNode{
    private List<Node> statements;

    public List<Node> getStatements() {
        return statements;
    }

    public void setStatements(List<Node> statements) {
        this.statements = statements;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitBlockStatement(this, c);
    }
}

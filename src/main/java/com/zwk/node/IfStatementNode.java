package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:31
 */

public class IfStatementNode extends BaseNode {

    private Node value;
    private List<Node> statements;

    private List<Node> ifStatements;

    private List<Node> elseStatements;

    public Node getValue() {
        return value;
    }

    public void setValue(Node value) {
        this.value = value;
    }

    public List<Node> getStatements() {
        return statements;
    }

    public void setStatements(List<Node> statements) {
        this.statements = statements;
    }

    public List<Node> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<Node> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<Node> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<Node> elseStatements) {
        this.elseStatements = elseStatements;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitIfStatement(this, c);
    }
}

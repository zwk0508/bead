package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:32
 */

public class ForStatementNode extends BaseNode {
    private String first;

    private String second;

    private Node collectionValue;
    private List<Node> statements;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public Node getCollectionValue() {
        return collectionValue;
    }

    public void setCollectionValue(Node collectionValue) {
        this.collectionValue = collectionValue;
    }

    public List<Node> getStatements() {
        return statements;
    }

    public void setStatements(List<Node> statements) {
        this.statements = statements;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitForStatement(this, c);
    }
}

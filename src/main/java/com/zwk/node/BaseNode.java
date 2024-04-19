package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:53
 */

public class BaseNode implements Node {

    private int line;
    private int column;

    private Node parent;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visit(this,c);
    }
}

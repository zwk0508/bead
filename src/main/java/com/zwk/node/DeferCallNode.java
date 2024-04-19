package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:30
 */

public class DeferCallNode extends BaseNode {

    private Node call;

    public Node getCall() {
        return call;
    }

    public void setCall(Node call) {
        this.call = call;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitDeferCall(this, c);
    }
}

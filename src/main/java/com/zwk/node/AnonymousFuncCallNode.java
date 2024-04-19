package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:23
 */

public class AnonymousFuncCallNode extends BaseNode {

    private Node anonymousFunc;

    private List<Node> paramValues;

    public Node getAnonymousFunc() {
        return anonymousFunc;
    }

    public void setAnonymousFunc(Node anonymousFunc) {
        this.anonymousFunc = anonymousFunc;
    }

    public List<Node> getParamValues() {
        return paramValues;
    }

    public void setParamValues(List<Node> paramValues) {
        this.paramValues = paramValues;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitAnonymousFuncCall(this, c);
    }
}

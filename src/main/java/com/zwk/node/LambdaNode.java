package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:24
 */

public class LambdaNode extends BaseNode{
    private List<String> paramNames;

    private Node lambdaBody;

    public List<String> getParamNames() {
        return paramNames;
    }

    public void setParamNames(List<String> paramNames) {
        this.paramNames = paramNames;
    }

    public Node getLambdaBody() {
        return lambdaBody;
    }

    public void setLambdaBody(Node lambdaBody) {
        this.lambdaBody = lambdaBody;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitLambda(this, c);
    }
}

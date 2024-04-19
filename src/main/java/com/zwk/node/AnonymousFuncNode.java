package com.zwk.node;

import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:23
 */

public class AnonymousFuncNode extends BaseNode {
    private List<String> paramNames;
    private List<Node> statements;

    public List<String> getParamNames() {
        return paramNames;
    }

    public void setParamNames(List<String> paramNames) {
        this.paramNames = paramNames;
    }

    public List<Node> getStatements() {
        return statements;
    }

    public void setStatements(List<Node> statements) {
        this.statements = statements;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitAnonymousFunc(this, c);
    }
}

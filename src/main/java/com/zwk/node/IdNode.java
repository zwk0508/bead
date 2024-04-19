package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/19 15:35
 */

public class IdNode extends BaseNode{
    public String id;

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitId(this, c);
    }
}

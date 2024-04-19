package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/19 15:53
 */

public class StringLiteralValueNode extends LiteralValueNode {
    public String value;

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitStringLiteralValue(this, c);
    }
}

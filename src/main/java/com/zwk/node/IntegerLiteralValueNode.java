package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/19 15:52
 */

public class IntegerLiteralValueNode extends LiteralValueNode {
    public int value;

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitIntegerLiteralValue(this, c);
    }
}

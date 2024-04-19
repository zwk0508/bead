package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/19 15:53
 */

public class FloatLiteralValueNode extends LiteralValueNode {
    public double value;
    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitFloatLiteralValue(this, c);
    }
}

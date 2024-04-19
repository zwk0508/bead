package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/19 15:50
 */

public class BooleanLiteralValueNode extends LiteralValueNode {
    public boolean value;

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitBooleanLiteralValue(this, c);
    }

}

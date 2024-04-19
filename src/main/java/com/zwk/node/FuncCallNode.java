package com.zwk.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 15:21
 */

public class FuncCallNode extends BaseNode {
    public Node func;

    public List<Node> params = new ArrayList<>();


    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitFuncCall(this, c);
    }
}

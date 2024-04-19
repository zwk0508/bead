package com.zwk.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:50
 */

public class RootNode extends BaseNode {

    public List<Node> imports = new ArrayList<>();

    public List<Node> inits = new ArrayList<>();
    public List<Node> nodes = new ArrayList<>();


    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitRoot(this, c);
    }
}

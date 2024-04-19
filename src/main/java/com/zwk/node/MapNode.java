package com.zwk.node;

import java.util.Map;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:58
 */

public class MapNode extends BaseNode {

    private Map<String, Node> map;

    public Map<String, Node> getMap() {
        return map;
    }

    public void setMap(Map<String, Node> map) {
        this.map = map;
    }

    @Override
    public <R, C> R accept(NodeVisitor<R, C> visitor, C c) {
        return visitor.visitMap(this, c);
    }
}

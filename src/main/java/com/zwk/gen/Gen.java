package com.zwk.gen;

import com.zwk.gen.object.Bead;
import com.zwk.gen.object.Unit;
import com.zwk.node.Node;
import com.zwk.node.NodeVisitor;
import com.zwk.node.RootNode;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/17 15:32
 */

public class Gen extends NodeVisitor<Bead, Context> {
    @Override
    public Bead visitRoot(RootNode node, Context context) {


        for (Node init : node.inits) {

        }

        return null;
    }
}

package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:50
 */

class RootNode : BaseNode() {

    val imports = mutableListOf<Node>()
    val inits = mutableListOf<Node>()
    val funs = mutableListOf<Node>()

    override fun <R, C> accept(visitor: NodeVisitor<R, C>, c: C): R {
        return visitor.visitRoot(this, c)
    }
}

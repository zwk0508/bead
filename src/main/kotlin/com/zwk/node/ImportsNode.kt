package com.zwk.node;

/**
 * @author zwk
 * @version 1.0
 * @date 2024/4/3 14:52
 */

class ImportsNode : BaseNode() {
    val paths = mutableListOf<String>();

    var alias: String? = null


    override fun <R, C> accept(visitor: NodeVisitor<R, C>, c: C): R {
        return visitor.visitImports(this, c);
    }
}

package com.zwk.node;


interface Node {
    fun <R, C> accept(visitor: NodeVisitor<R, C>, c: C): R
}

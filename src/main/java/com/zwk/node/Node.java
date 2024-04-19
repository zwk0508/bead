package com.zwk.node;


public interface Node {
    <R, C> R accept(NodeVisitor<R, C> visitor, C c);
}

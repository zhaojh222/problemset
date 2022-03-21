package com.zjh.lc.problemset.common;

import com.zjh.lc.problemset.others.NodeOperator;

public abstract class LinkedList<T> {

    private NodeOperator nodeOperator = new NodeOperator<T>();
    protected Node head;
    protected Node tail;

    public abstract void add(T data);

    public void browser() {
        nodeOperator.outputNode(head);
    }

    public Node getHead() {
        return head;
    }
}

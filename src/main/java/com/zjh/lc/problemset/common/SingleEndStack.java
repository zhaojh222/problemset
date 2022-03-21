package com.zjh.lc.problemset.common;

import com.zjh.lc.problemset.others.NodeOperator;

public class SingleEndStack<T> extends Stack<T>{

    private Node head;
    private NodeOperator nodeOperator = new NodeOperator();

    @Override
    public void push(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        T data = (T) head.value;
        if (head.next != null) {
            head = head.next;
        } else {
            head = null;
        }
        return data;
    }

    @Override
    public void browser() {
        nodeOperator.outputNode(head);
    }
}

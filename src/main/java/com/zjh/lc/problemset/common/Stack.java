package com.zjh.lc.problemset.common;

import com.zjh.lc.problemset.others.NodeOperator;

public class Stack {

    private Node head;
    private Node tail;

    public void push(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public int pop() {
        Node node = tail.prev;
        int data = tail.value;
        if(head != tail) {
            node.next = null;
            tail = node;
        } else {
            head = null;
            tail = null;
        }
        return data;
    }

    public void browser() {
        NodeOperator nodeOperator = new NodeOperator();
        nodeOperator.outputNode(head);
    }
}

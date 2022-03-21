package com.zjh.lc.problemset.common;

import com.zjh.lc.problemset.others.NodeOperator;

public class SingleEndStack extends Stack{

    private Node head;
    private NodeOperator nodeOperator = new NodeOperator();

    @Override
    public void push(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    @Override
    public int pop() {
        if (head == null) {
            return -1;
        }
        int data = head.value;
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

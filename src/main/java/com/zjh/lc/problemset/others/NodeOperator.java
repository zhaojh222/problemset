package com.zjh.lc.problemset.others;

import com.zjh.lc.problemset.common.Node;

public class NodeOperator {

    public Node swapNodeValues(Node node) {
        Node currentNode = node;
        Node nextNode = null;
        while (currentNode != null && (nextNode = currentNode.getNext())!= null) {
            int tmp = currentNode.getValue();
            currentNode.setValue(nextNode.getValue());
            nextNode.setValue(tmp);
            currentNode = nextNode.getNext();
        }
        return node;
    }

    public void outputNode(Node node) {
        Node pos = node;
        while(pos != null) {
            System.out.println(pos.getValue());
            pos = pos.getNext();
        }
    }

    public Node reverseNode(Node node) {

        Node head = node;
        Node pos = node;
        Node next = null;
        while(pos != null && (next = pos.getNext())!=null) {
            pos.setNext(next.getNext());
            next.setNext(head);
            head = next;
        }
        return head;
    }
}

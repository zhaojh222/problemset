package com.zjh.lc.problemset.others;

import com.zjh.lc.problemset.common.Node;

public class NodeOperator<T> {

    public Node swapNodeValues(Node node) {
        Node currentNode = node;
        Node nextNode = null;
        while (currentNode != null && (nextNode = currentNode.getNext())!= null) {
            T tmp = (T) currentNode.getValue();
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

    public Node removeNthEndNode(Node node, int n) {
        boolean outOfRange = false;
        if(node == null) return null;
        if(n <= 0) return node;
        Node head = node;
        Node fast = head, slow = head;
        while(n-- > 0) {
            fast = fast.getNext();
            if (fast == null) {
                outOfRange = true;
                break;
            }
        }
        while(fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        if (!outOfRange) {
            slow.setNext(slow.getNext().getNext());
        } else {
            head = slow.getNext();
        }
        return head;
    }
}

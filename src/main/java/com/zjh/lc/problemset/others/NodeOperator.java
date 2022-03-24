package com.zjh.lc.problemset.others;

import com.zjh.lc.problemset.common.Node;

import java.util.ArrayList;
import java.util.List;

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
            System.out.println(pos.value);
            pos = pos.next;
        }
    }

    public Node reverseNode(Node node) {

        Node head = node;
        Node pos = node;
        Node next = null;
        while(pos != null && (next = pos.next)!=null) {
            pos.next = next.next;
            next.next = head;
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

    /**
     * For each K nodes, reverse them, if the left node count less then K, then ignore
     * @param head
     * @param k
     */
    public Node reverseKNode(Node head, int k) {
        Node dummy = new Node(0,head);      //Create a dummy head;
        Node pre = dummy, cur = dummy;
        while (cur.next != null) {
            for (int i = 0; i < k && cur != null; ++i) {
                cur = cur.next;
            }
            if (cur == null) {
                return dummy.next;          //If the left block node count less then K, don't need to process
            }
            Node nextBlock = cur.next;
            cur.next = null;
            Node start = pre.next;          //start is the K block need to be reversed
            pre.next = reverseNode(start);  //after reversed, start it should be the K block's tail
            start.next = nextBlock;         //So here, connect the reversed K block to the next
            pre = start;
            cur = pre;
        }
        return dummy.next;
    }
}

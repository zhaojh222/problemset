package com.zjh.lc.problemset.common;

public class SingleEndLinkedList<T> extends LinkedList<T>{

    @Override
    public void add(Object data) {
        Node node = new Node<T>((T) data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
}

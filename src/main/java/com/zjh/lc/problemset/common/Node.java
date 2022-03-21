package com.zjh.lc.problemset.common;

import lombok.Data;

@Data
public class Node<T> {

    public T value;
    public Node next;
    public Node prev;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }
}

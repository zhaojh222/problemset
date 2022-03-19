package com.zjh.lc.problemset.common;

import lombok.Data;

@Data
public class Node {

    public int value;
    public Node next;
    public Node prev;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

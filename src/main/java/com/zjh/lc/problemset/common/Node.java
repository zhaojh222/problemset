package com.zjh.lc.problemset.common;

import lombok.Data;

@Data
public class Node<T> {

    public T value;
    public Node<T> next;
    public Node<T> prev;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node pos = next;
        sb.append(value).append("->");
        while(pos!=null){
            sb.append(pos.value).append("->");
            pos = pos.next;
        }
        return sb.toString();
    }
}

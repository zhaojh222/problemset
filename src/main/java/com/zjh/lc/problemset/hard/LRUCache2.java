package com.zjh.lc.problemset.hard;

import java.util.HashMap;
import java.util.Map;

public class LRUCache2<K, V> {
    private final int capacity;
    private final Map<K, Node<K, V>> cache;
    private Node<K, V> head;
    private Node<K, V> tail;

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> prev;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new Node<>(null, null);
        tail = new Node<>(null, null);
        head.next = tail;
        tail.prev = head;
    }

    public V get(K key) {
        Node<K, V> node = cache.get(key);
        if (node != null) {
            moveToHead(node);
            return node.value;
        }
        return null;
    }

    public void put(K key, V value) {
        Node<K, V> node = cache.get(key);
        if (node == null) {
            node = new Node<>(key, value);
            cache.put(key, node);
            addNodeToHead(node);
            if (cache.size() > capacity) {
                removeTail();
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }

    private void addNodeToHead(Node<K, V> node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node<K, V> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveToHead(Node<K, V> node) {
        removeNode(node);
        addNodeToHead(node);
    }

    private void removeTail() {
        Node<K, V> nodeToRemove = tail.prev;
        removeNode(nodeToRemove);
        cache.remove(nodeToRemove.key);
    }

    public static void main(String[] args) {
        LRUCache2<Integer, String> LRUCache2 = new LRUCache2<>(3);

        LRUCache2.put(1, "One");
        LRUCache2.put(2, "Two");
        LRUCache2.put(3, "Three");

        System.out.println("Initial Cache: " + LRUCache2.cache.keySet());

        LRUCache2.get(1);
        System.out.println("After accessing key 1: " + LRUCache2.cache.keySet());

        LRUCache2.put(4, "Four");
        System.out.println("After adding key 4: " + LRUCache2.cache.keySet());
    }
}


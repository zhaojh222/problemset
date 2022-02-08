package com.zjh.lc.problemset.others;

import com.zjh.lc.problemset.common.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapPairsTest {

    @Test
    void swapNodeValues() {
        Node node5 = new Node(5);
        Node node4 = new Node(4,node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        SwapPairs swapPairs = new SwapPairs();

        swapPairs.swapNodeValues(node1);
        swapPairs.outputNode(node1);
    }
}
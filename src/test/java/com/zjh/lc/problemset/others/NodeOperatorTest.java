package com.zjh.lc.problemset.others;

import com.zjh.lc.problemset.common.Node;
import org.junit.jupiter.api.Test;

public class NodeOperatorTest {

    private NodeOperator nodeOperator = new NodeOperator();

    @Test
    void swapNodeValues() {
        Node node5 = new Node(5);
        Node node4 = new Node(4,node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        nodeOperator.swapNodeValues(node1);
        nodeOperator.outputNode(node1);
    }

    @Test
    public void testReverseNode() {
        Node node5 = new Node(5);
        Node node4 = new Node(4,node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Node reverseNode = nodeOperator.reverseNode(node1);
        nodeOperator.outputNode(reverseNode);
    }
}
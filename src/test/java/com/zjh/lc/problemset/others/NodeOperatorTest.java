package com.zjh.lc.problemset.others;

import com.zjh.lc.problemset.common.Node;
import org.junit.jupiter.api.Test;

public class NodeOperatorTest {

    private NodeOperator nodeOperator = new NodeOperator();

    @Test
    void swapNodeValues() {
        Node node = createNode();
        nodeOperator.swapNodeValues(node);
        nodeOperator.outputNode(node);
    }

    @Test
    public void testReverseNode() {
        Node node = createNode();
        Node reverseNode = nodeOperator.reverseNode(node);
        nodeOperator.outputNode(reverseNode);
    }

    private Node createNode() {
        Node node6 = new Node(6);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        return node1;
    }
}
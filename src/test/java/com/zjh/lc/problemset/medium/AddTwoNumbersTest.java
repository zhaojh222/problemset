package com.zjh.lc.problemset.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void addTwoNumbers() {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node11.next = node12;
        node12.next = node13;

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node21.next = node22;
        node22.next = node23;

        ListNode result = addTwoNumbers.addTwoNumbers(node11, node21);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
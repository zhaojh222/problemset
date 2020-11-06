package com.zjh.lc.problemset.medium;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode node = head;

        int nextPlusValue = 0;
        int nodeValue = 0;
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + nextPlusValue;
            nodeValue = sum % 10;
            nextPlusValue =  sum / 10;
            node.next = new ListNode(nodeValue);
            node = node.next;

            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int sum = l1.val + nextPlusValue;
            nodeValue = sum % 10;
            nextPlusValue =  sum / 10;
            node.next = new ListNode(nodeValue);
            node = node.next;

            l1 = l1.next;
        }
        while(l2 != null){
            int sum = l2.val + nextPlusValue;
            nodeValue = sum % 10;
            nextPlusValue =  sum / 10;
            node.next = new ListNode(nodeValue);
            node = node.next;

            l2 = l2.next;
        }
        if(nextPlusValue == 1){
            node.next = new ListNode(1);
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

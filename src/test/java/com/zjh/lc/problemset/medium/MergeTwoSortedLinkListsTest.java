package com.zjh.lc.problemset.medium;

import com.zjh.lc.problemset.common.LinkedList;
import com.zjh.lc.problemset.common.SingleEndLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoSortedLinkListsTest {

    private MergeTwoSortedLinkLists instance = new MergeTwoSortedLinkLists();

    @Test
    public void merge() {
        LinkedList<Integer> l1 = new SingleEndLinkedList<>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(11);
        LinkedList<Integer> l2 = new SingleEndLinkedList<>();
        l2.add(4);
        l2.add(6);
        l2.add(8);

        LinkedList<Integer> result = instance.merge(l1,l2);
        result.browser();
    }
}
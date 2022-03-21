package com.zjh.lc.problemset.medium;

import com.zjh.lc.problemset.common.LinkedList;
import com.zjh.lc.problemset.common.Node;
import com.zjh.lc.problemset.common.SingleEndLinkedList;

public class MergeTwoSortedLinkLists {

    public LinkedList<Integer> merge(LinkedList<Integer> list1,LinkedList<Integer> list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        LinkedList<Integer> result = new SingleEndLinkedList<>();
        Node<Integer> pos1 = list1.getHead();
        Node<Integer> pos2 = list2.getHead();
        while(pos1 != null && pos2 != null) {
            if (pos1.value < pos2.value) {
                Integer data = pos1.value;
                result.add(data);
                pos1 = pos1.next;
            } else {
                Integer data = pos2.value;
                result.add(data);
                pos2 = pos2.next;
            }
        }
        while(pos1 != null) {
            Integer data = pos1.value;
            result.add(data);
            pos1 = pos1.next;
        }
        while(pos2 != null) {
            Integer data = pos2.value;
            result.add(data);
            pos2 = pos2.next;
        }
        return result;
    }
}

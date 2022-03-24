package com.zjh.lc.problemset.others;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperatorTest {

    private ArrayOperator instance = new ArrayOperator();

    @Test
    public void removeDuplicatedFromSortedArray() {
        int[] array = new int[]{1,1,2,2,3,3,4,4,5,5,6,6,6,7,7};
        int count = instance.removeDuplicatedFromSortedArray(array);
        assertEquals(7, count);
    }


    @Test
    public void testRemoveDuplicatedFromSortedArray() {
        int[] nums = new int[]{1,1,2,3,2,3,4,2,5,6,2};
        int result = instance.removeElement(nums, 2);
        for(int i=0;i<result;i++){
            System.out.println(nums[i]);
        }
        assertEquals(7, result);
    }
}
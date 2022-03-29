package com.zjh.lc.problemset.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

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

    @Test
    public void rotateSortedArray() {
        int[] nums = new int[]{1,2,3,4,6,8,9,12,15};
        int index = 5;
        int[] results = instance.rotateSortedArray(nums,index);
        Arrays.stream(results).forEach(System.out::println);
    }

    @Test
    public void binarySearch() {
        int[] nums = new int[]{1,2,3,4,4,4,6,8,9,12,15};
        int value = 4;
        int result = instance.binarySearch(nums, value);
        assertEquals(5, result);
    }

    @Test
    public void BinarySearchFirst() {
        int[] nums = new int[]{1,2,3,4,4,4,6,8,9,12,15};
        int value = 4;
        int result = instance.binarySearchFirst(nums, value);
        assertEquals(3, result);
    }

    @Test
    public void binarySearchLast() {
        int[] nums = new int[]{1,2,3,4,4,4,6,8,9,12,15};
        int value = 4;
        int result = instance.binarySearchLast(nums, value);
        assertEquals(5, result);
    }
}
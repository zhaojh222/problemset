package com.zjh.lc.problemset.others;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void searchInsertPosition() {
        int[] nums = new int[]{10,20,30,40,50,60,70,80};
        int value = 99;
        int result = instance.searchInsertPosition(nums, value);
        assertEquals(8, result);
    }

    @Test
    void findMissingPositive() {
        int[] nums = new int[]{3,11,2,8,-1,-10,7};
        int result = instance.findMissingPositive(nums);
        assertEquals(2, result);
    }

    @Test
    void countSubArray() {
        List<Integer> numbers = ImmutableList.of(2,3,4,6,10);
        int target = 6;
        int result = instance.countSubArray(numbers,target);
        assertEquals(3, result);
    }

    @Test
    void rotateImage() {
        int[][] nums = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] results = instance.rotateImage(nums);
        instance.outputMatrix(results);
    }
}
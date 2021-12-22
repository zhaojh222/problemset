package com.zjh.lc.problemset.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void twoSum() {
        int[] nums = new int[]{2, 3, 5, 6, 9};
        int target = 11;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(result);
        assertEquals(3, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void twoSumSorted() {
        int[] nums = new int[]{2, 3, 5, 7, 8};
        int target = 9;
        int[] result = twoSum.twoSumSorted(nums, target);
        assertEquals(0, result[0]);
        assertEquals(3, result[1]);
    }
}
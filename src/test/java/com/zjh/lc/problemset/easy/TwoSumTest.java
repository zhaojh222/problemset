package com.zjh.lc.problemset.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
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
        int[] nums = new int[]{2, 3, 5, 6, 8};
        int target = 11;
        int[] result = twoSum.twoSumSorted(nums, target);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
    }
}
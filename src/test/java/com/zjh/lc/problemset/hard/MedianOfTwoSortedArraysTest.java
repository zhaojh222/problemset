package com.zjh.lc.problemset.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();

    @Test
    public void findMedianSortedArrays() {

        int[] nums1 = new int[]{1,3,5,7,9};
        int[] nums2 = new int[]{1,2,4};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(3.5, result, 0.0);
    }
}
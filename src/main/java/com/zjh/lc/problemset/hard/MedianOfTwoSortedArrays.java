package com.zjh.lc.problemset.hard;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Return the median of the two sorted arrays.
 * <p>
 * Follow up: The overall run time complexity should be O(log (m+n)).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 * <p>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * Example 3:
 * <p>
 * Input: nums1 = [0,0], nums2 = [0,0]
 * Output: 0.00000
 * Example 4:
 * <p>
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.00000
 * Example 5:
 * <p>
 * Input: nums1 = [2], nums2 = []
 * Output: 2.00000
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        double result = 0.0;
        int length = nums1.length + nums2.length;
        int[] newNums = new int[length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                newNums[k] = nums1[i];
                i++;
            } else {
                newNums[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            newNums[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            newNums[k++] = nums2[j++];
        }

        if (length % 2 == 1) {
            return newNums[length / 2] * 1.0;
        } else {
            return (newNums[length / 2 - 1] + newNums[length / 2]) / 2.0;
        }
    }
}

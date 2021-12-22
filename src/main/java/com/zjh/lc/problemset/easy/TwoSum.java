package com.zjh.lc.problemset.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and and integer target, return the indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
@Slf4j
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (!map.containsKey(value)) {
                map.put(target - value, i);
            } else {
                return new int[]{i, map.get(value)};
            }
        }
        return new int[]{};
    }

    public int[] twoSumSorted(int[] nums, int target) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int tmpSum = nums[start] + nums[end];
            if (tmpSum == target) {
                return new int[]{start, end};
            } else if (tmpSum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{};
    }
}

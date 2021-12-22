package com.zjh.lc.problemset.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreeSumTest {

    @Test
    void threeSum1() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result = new TreeSum().threeSum(nums);
        result.forEach(x -> System.out.println(x));
    }

    @Test
    void threeSum2() {
        int[] nums = new int[3000];
        List<List<Integer>> result = new TreeSum().threeSum(nums);
        result.forEach(x -> System.out.println(x));
    }
}
package com.zjh.lc.problemset.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private CombinationSum instance = new CombinationSum();

    @Test
    void combinationSum() {
        int[] candidates = new int[]{2,3,5,7,8,11};
        int target = 8;
        List<List<Integer>> nums = instance.combinationSum(candidates,target);
        assertNotNull(nums);
        nums.stream().forEach(subList -> {
            subList.forEach(num -> System.out.print(num + ","));
            System.out.println();
        });
    }

    @Test
    void combinationSum2() {
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> nums = instance.combinationSum2(candidates,target);
        assertNotNull(nums);
        nums.stream().forEach(subList -> {
            subList.forEach(num -> System.out.print(num + ","));
            System.out.println();
        });
    }
}
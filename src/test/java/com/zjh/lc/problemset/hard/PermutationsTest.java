package com.zjh.lc.problemset.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    private Permutations instance = new Permutations();

    @Test
    void permutation() {
        int[] nums = {1,2,3,4};
        List<List<Integer>> results = instance.permutation(nums);
        results.forEach(list -> {
            list.forEach(System.out::print);
            System.out.println();
        });
    }
}
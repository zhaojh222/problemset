package com.zjh.lc.problemset.hard;

import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {

    private List<List<Integer>> permutes;

    public List<List<Integer>> permutation(int[] nums) {
        permutes = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
        List<Integer> data = Ints.asList(nums);
        dfsp(new ArrayList<>(),data);
        return permutes;
    }

    private void dfsp(List<Integer> permutations, List<Integer> subList) {
        if (subList.size() > 1) {
            for(int num : subList) {
                permutations.add(num);
                List<Integer> newSubList = makeExcludedSubList(subList, num);
                dfsp(permutations, newSubList);
                permutations.remove(permutations.size() - 1);
            }
        } else {
            permutations.add(subList.get(0));
            permutes.add(ImmutableList.copyOf(permutations));
            permutations.remove(permutations.size() -1);
        }
    }

    private List<Integer> makeExcludedSubList(List<Integer> data, int excludedNum) {
        List<Integer> result = data.stream().filter(num -> num!= excludedNum)
                .collect(Collectors.toList());
        return result;
    }
}

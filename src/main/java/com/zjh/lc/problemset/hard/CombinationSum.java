package com.zjh.lc.problemset.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    private List<List<Integer>> nums;
    private int target;
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        nums = new ArrayList<>();
        this.target = target;
        this.candidates = candidates;
        dfs_search(0,0,new ArrayList<>());
        return nums;
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        nums = new ArrayList<>();
        Arrays.sort(candidates);
        this.target = target;
        this.candidates = candidates;
        dfs_search2(0, 0, new ArrayList<>());
        return nums;
    }

    private void dfs_search(int sum, int index, List<Integer> subList){
        if (sum == target) {
            nums.add(new ArrayList<>(subList));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i=index;i<candidates.length;i++) {
            int candidate = candidates[i];
            subList.add(candidate);
            dfs_search(sum + candidate,i,subList);
            subList.remove(subList.size() - 1);
        }
    }

    private void dfs_search2(int sum, int index, List<Integer> subList){
        if (sum == target) {
            nums.add(new ArrayList<>(subList));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i=index;i<candidates.length;i++) {
            if (i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            int candidate = candidates[i];
            subList.add(candidate);
            dfs_search2(sum + candidate,i+1,subList);
            subList.remove(subList.size() - 1);
        }
    }
}

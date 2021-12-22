package com.zjh.lc.problemset.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class TreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            List<List<Integer>> list = twoSum(Arrays.copyOfRange(nums, i+1, nums.length), 0 - nums[i]);
            if(!list.isEmpty()){
                for (List<Integer> e : list) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.addAll(e);
                    result.add(subList);
                }
            }
        }
        result = result.stream().map(e -> {
           return e.stream().sorted().collect(toList());
        }).distinct().collect(toList());
        return result;
    }

    private List<List<Integer>> twoSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 2){
            return list;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (!map.containsKey(value)) {
                map.put(target - value, i);
            } else {
                list.add(Arrays.asList(nums[map.get(value)], value));
            }
        }
        return list;
    }
}

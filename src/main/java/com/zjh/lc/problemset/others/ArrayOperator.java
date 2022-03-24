package com.zjh.lc.problemset.others;

public class ArrayOperator {

    public int removeDuplicatedFromSortedArray(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 1 || num != nums[i - 1]) {
                nums[i++] = num;
            }
        }
        return i;
    }

    public int removeElement(int[] nums, int value) {
        int count = 0;
        for(int num: nums) {
            if(num != value) {
                nums[count++] = num;
            }
        }
        return count;
    }
}

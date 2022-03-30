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

    public int[] rotateSortedArray(int[] nums, int index) {
        int len = nums.length;
        int[] results = new int[len];
        for(int i=0;i<len;i++) {
            results[i] = nums[(i + index) % len];
        }
        return results;
    }

    public int binarySearch(int[] nums, int value) {
        int len = nums.length;
        int start = 0, end = len;
        int result = -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (value < nums[mid]) {
                end = mid - 1;
            } else if (value > nums[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                break;
            }
        }
        return result;
    }

    public int binarySearchFirst(int[] nums, int value) {
        int len = nums.length;
        int start = 0, end = len;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (value < nums[mid]) {
                end = mid - 1;
            } else if (value > nums[mid]) {
                start = mid + 1;
            } else {
                for (int j = mid; j > 0; j--) {
                    if (nums[j] < value) {
                        return j + 1;
                    }
                }
            }
        }
        return -1;
    }

    public int binarySearchLast(int[] nums, int value) {
        int len = nums.length;
        int start = 0, end = len;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (value < nums[mid]) {
                end = mid - 1;
            } else if (value > nums[mid]) {
                start = mid + 1;
            } else {
                for (int j = mid; j < len; j++) {
                    if (nums[j] > value) {
                        return j - 1;
                    }
                }
            }
        }
        return -1;
    }

    public int searchInsertPosition(int[] nums, int value) {
        int len = nums.length;
        int start = 0, end = len;
        int result = -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (value < nums[mid]) {
                end = mid - 1;
            } else if (value > nums[mid]) {
                start = mid + 1;
            } else {
                result = mid;
                break;
            }
        }
        if (start > end) {
            
        }
        return result;
    }
}

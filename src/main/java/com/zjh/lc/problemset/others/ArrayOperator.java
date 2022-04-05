package com.zjh.lc.problemset.others;

import java.util.List;

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
        int start = 0, end = len - 1;
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
        int start = 0, end = len - 1;

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
        int start = 0, end = len - 1;

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
        int start = 0, end = len - 1;
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
            result = start;
        }
        return result;
    }

    public int findMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int result = 0;
        for (int i=0;i< nums.length;i++) {
            int min = nums[result];
            if(nums[i] > 0 && nums[i] < min) {
                result = i;
            }
        }
        return result;
    }

    public int countSubArray(List<Integer> numbers, int target) {
        int sum = 0;
        int count = 0;
        int len = numbers.size();
        for(int i=0;i<len;i++){
            if(numbers.get(i) <= target) {
                count ++;
            }
            sum = numbers.get(i);
            for(int j=i+1;j<len;j++){
                sum += numbers.get(j);
                if(sum <= target){
                    count ++;
                }
            }
        }
        return count;
    }

    /**
     * 1,2,3
     * 4,5,6
     * 7,8,9
     * rotated to
     * 7,4,1
     * 8,5,2
     * 9,6,3
     * @param nums
     * @return
     */
    public int[][] rotateImage(int[][] nums) {
        int length = nums.length;
        int[][] results = new int[length][length];
        for(int i=0;i<nums.length;i++) {
            for (int j = 0; j < nums.length; j++) {
                results[i][j] = nums[length-1-j][i];
            }
        }
        return results;
    }

    public void outputMatrix(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                System.out.printf("%d\t",nums[i][j]);
            }
            System.out.println();
        }
    }

}

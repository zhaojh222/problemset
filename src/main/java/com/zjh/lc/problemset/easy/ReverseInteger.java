package com.zjh.lc.problemset.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Note:
 * Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 * Example 4:
 *
 * Input: x = 0
 * Output: 0
 */
public class ReverseInteger {

    public int reverse(int num){
        if(num == 0){
            return 0;
        }
        long result = 0;
        int left = num;
        int right = 0;
        do{
            right = left % 10;
            left = left / 10;
            result = result * 10 + right;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
                return 0;
            }
        }while(left != 0);

        return (int) result;
    }
}

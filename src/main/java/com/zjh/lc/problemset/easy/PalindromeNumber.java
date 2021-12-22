package com.zjh.lc.problemset.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }else if(x < 10){
            return true;
        }
        int revValue = reverse(x);
        return x == revValue;
    }

    private int reverse(int num){
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

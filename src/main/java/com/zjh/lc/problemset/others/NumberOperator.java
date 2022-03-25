package com.zjh.lc.problemset.others;

public class NumberOperator {

    public int divideNums(int dividend, int divisor) {
        if (divisor == 0) {
            throw new RuntimeException("Divisor is 0");
        }
        int result = 0;
        boolean isNegative = true;
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            isNegative = false;
        }
        int absDividend = dividend > 0 ? dividend : 0 - dividend;
        int absDivisor = divisor > 0 ? divisor : 0 - divisor;
        while((absDividend = absDividend - absDivisor) > 0) {
            result ++;

        }
        return isNegative ? 0 - result : result;
    }
}

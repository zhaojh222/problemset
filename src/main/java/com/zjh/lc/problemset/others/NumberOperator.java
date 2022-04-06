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

    public double myPow(double x, int y) {
        return y > 0 ? pow(x, y) : 1.0 / pow(x, -y);
    }

    private double pow(double x, int y) {
        if (y == 0) {
            return 1.0;
        } else {
            double value = pow(x, y >> 1);
            return (y & 1) == 0 ? value * value : value * value * x;
        }
    }
}

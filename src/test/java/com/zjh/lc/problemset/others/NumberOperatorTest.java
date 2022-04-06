package com.zjh.lc.problemset.others;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOperatorTest {

    private NumberOperator instance = new NumberOperator();

    @Test
    public void divideNums() {
        int dividend = 10;
        int divisor = 3;
        int result = instance.divideNums(dividend, divisor);
        assertEquals(3, result);

        dividend = 7;
        divisor = -3;
        result = instance.divideNums(dividend, divisor);
        assertEquals(-2, result);
    }

    @Test
    void myPow() {
        double x = 2.1;
        int y = 3;
        double result = instance.myPow(x, y);
        assertEquals(9.261, result, 0.001);
    }
}
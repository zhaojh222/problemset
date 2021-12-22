package com.zjh.lc.problemset.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseIntegerTest {

    @Test
    void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int num = 1534236469;
        int result = reverseInteger.reverse(num);
        assertEquals(0, result);
    }
}
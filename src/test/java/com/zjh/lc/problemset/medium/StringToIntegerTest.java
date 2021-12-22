package com.zjh.lc.problemset.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    @Test
    void convert() {

        StringToInteger stringToInteger = new StringToInteger();
        String s = "+1";
        int result = stringToInteger.convert(s);
        assertEquals(1, result);
    }
}
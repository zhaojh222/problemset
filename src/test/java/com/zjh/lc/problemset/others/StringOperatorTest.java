package com.zjh.lc.problemset.others;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperatorTest {

    private StringOperator instance = new StringOperator();

    @Test
    public void indexOf() {
        String hayStack = "aabbcdefabdefeabe", needle = "bcde";
        int result = instance.indexOf(hayStack, needle);
        assertEquals(3, result);

        hayStack = "aaaa";
        needle = "bba";
        result = instance.indexOf(hayStack,needle);
        assertEquals(-1, result);
    }
}
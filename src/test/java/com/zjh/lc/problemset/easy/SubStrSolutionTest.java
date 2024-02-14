package com.zjh.lc.problemset.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubStrSolutionTest {
    @Test
    void strStr() {
        SubStrSolution solution = new SubStrSolution();
        String hayString = "hello";
        String needle = "ll";
        int result = solution.strStr(hayString, needle);
        assertEquals(2,result);
    }
}
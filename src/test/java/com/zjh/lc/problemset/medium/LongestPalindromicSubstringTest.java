package com.zjh.lc.problemset.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
    @Test
    public void longestPalindrome() {

        String s = "adefsdfsabcbasldfljljklfjlu";
        String result = solution.longestPalindrome(s);
        assertEquals("sabcbas", result);
    }
}
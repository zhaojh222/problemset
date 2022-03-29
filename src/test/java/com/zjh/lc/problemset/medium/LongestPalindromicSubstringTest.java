package com.zjh.lc.problemset.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring solution = new LongestPalindromicSubstring();
    @Test
    public void longestPalindrome() {

        String s = "adefsdfsabcbasldfljljklfjlu";
        String result = solution.longestPalindrome(s);
        assertEquals("sabcbas", result);
    }
}
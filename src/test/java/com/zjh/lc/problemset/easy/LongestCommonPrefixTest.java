package com.zjh.lc.problemset.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        String[] strs = new String[]{"flower","flow","flight"};
        String result = new LongestCommonPrefix().longestCommonPrefix(strs);
        assertEquals("fl", result);
    }
}
package com.zjh.lc.problemset.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void lengthOfLongestSubstring() {
        String s = "abcdefgcxyzklm";
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(11, result);
    }
}
package com.zjh.lc.problemset.medium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // Give s = "abcdefgcxyzklm"
        Set<Character> set = new LinkedHashSet<>();
        int result = 0;        //result
        int head = 0;
        int pos = 0;

        while(pos < s.length()){
            char chrPos = s.charAt(pos);
            char chrHead = s.charAt(head);
            if(set.contains(chrPos)){
                set.remove(chrHead);
                head ++;
            }else{
                set.add(chrPos);
                pos ++;
            }
            System.out.println(set);
            result = Math.max(result, pos - head);
        }
        return result;
    }
}

package com.zjh.lc.problemset.medium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int length = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int len1 = getLengthOfPalindromic(s, i, i);
            int len2 = getLengthOfPalindromic(s, i, i + 1);
            length = Math.max(len1, len2);
            if (length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int getLengthOfPalindromic(String s, int l, int r) {
        int left = l;
        int right = r;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

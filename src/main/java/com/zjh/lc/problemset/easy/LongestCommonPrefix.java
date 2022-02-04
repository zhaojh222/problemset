package com.zjh.lc.problemset.easy;

import org.springframework.util.StringUtils;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s == null || s.isEmpty()) {
                return "";
            }
            minLength = Math.min(minLength, s.length());
        }
        for (int i = 0; i < minLength; i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j< strs.length; j++){
                if(c != strs[j].charAt(i)){
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}

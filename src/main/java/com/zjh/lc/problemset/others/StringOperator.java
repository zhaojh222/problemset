package com.zjh.lc.problemset.others;

import org.springframework.util.StringUtils;

public class StringOperator {

    public int indexOf(String haystack,String needle) {
        if(StringUtils.isEmpty(haystack) || StringUtils.isEmpty(needle)){
            return -1;
        }
        int length = haystack.length(), lenSub = needle.length();
        char[] chars = haystack.toCharArray(), charsSub = needle.toCharArray();
        for(int i=0;i<length;i++) {
            if(chars[i] == charsSub[0]) {
                int j = 1;
                for(;j<lenSub;j++) {
                    if(chars[i+j] != charsSub[j]){
                        break;
                    }
                }
                if(j == lenSub) {
                    return i;
                }
            }
        }
        return -1;
    }
}

package com.zjh.lc.problemset.others;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        } else if (n == 1) {
            return "1";
        } else if (n == 2) {
            return "11" ;
        } else {
            String previous = countAndSay(n - 1);
            List<KVPair> kvPairs = new ArrayList<>();
            int count = 1;
            for (int i = 0;i<previous.length();i++) {
                int num = previous.charAt(i) - '0';
                if (i > 0) {
                    int prevNum = previous.charAt(i-1) - '0';
                    if (num == prevNum) {
                        count++;
                    } else {
                        kvPairs.add(new KVPair(prevNum, count));
                        count = 1;
                    }
                    if (i == previous.length() - 1) {
                        kvPairs.add(new KVPair(num,count));
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            kvPairs.stream().forEach(kvPair -> sb.append(kvPair.count).append(kvPair.num));
            return sb.toString();
        }
    }

    class KVPair {
        int num;
        int count;

        public KVPair(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
}

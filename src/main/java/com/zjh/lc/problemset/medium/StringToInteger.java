package com.zjh.lc.problemset.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {

    public int convert(String s){
        String regex = "^\\s*([+-]?\\d+)\\s*";
        long result = 0;
        int start = 0;
        boolean isNegative = false;
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()) {
            String content = matcher.group(1);
            if ('-' == content.charAt(0)) {
                start = 1;
                isNegative = true;
            }
            if ('+' == content.charAt(0)) {
                start = 1;
                isNegative = false;
            }
            for (int i = start; i < content.length(); i++) {
                int val = Integer.valueOf("" + content.charAt(i));
                result = result * 10 + val;
                if(!isNegative && result > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if(isNegative && (-1) * result < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
        }
        return isNegative ? -1 * (int) result : (int) result;
    }
}

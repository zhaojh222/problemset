package com.zjh.lc.problemset.easy;

import com.zjh.lc.problemset.common.SingleEndStack;
import com.zjh.lc.problemset.common.Stack;
import org.springframework.util.StringUtils;

public class ValidateParentheses {

    private Stack stack = new SingleEndStack<Character>();

    public boolean validate(String input) {
        if (StringUtils.isEmpty(input)) {
            return false;
        }
        char[] chars = input.toCharArray();
        for(char c: chars) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}'){
                char popValue = (char) stack.pop();
                if(c == ')') {
                    if (popValue != '(') return false;
                } else if (c == ']') {
                    if (popValue != '[') return false;
                } else {
                    if (popValue != '{') return false;
                }
            }
        }
        return true;
    }
}

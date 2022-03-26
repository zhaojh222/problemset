package com.zjh.lc.problemset.easy;

import com.zjh.lc.problemset.common.SingleEndStack;
import com.zjh.lc.problemset.common.Stack;
import org.springframework.util.StringUtils;

public class ValidateParentheses {

    private Stack stack;

    public boolean validate(String input) {
        stack = new SingleEndStack<Character>();
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

    public int longestValidParentheses(String input) {
        stack = new SingleEndStack();
        if(StringUtils.isEmpty(input)) {
            return 0;
        }
        int count = 0;
        char[] chars = input.toCharArray();
        for(char ch:chars) {
            if(ch == '(') {
                stack.push(ch);
            } else if(ch == ')') {
                if (stack.isEmpty()) {
                    continue;
                }
                stack.pop();
                count += 2;
            }
        }
        return count;
    }
}

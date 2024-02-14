package com.zjh.lc.problemset.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

public class GenerateParenthesesTest {

    private GenerateParentheses instance = new GenerateParentheses();

    @Test
    public void generateParentheses() {
        int n = 3;
        List<String> result = instance.generateParentheses(n);
        result.stream().forEach(System.out::println);
    }
}
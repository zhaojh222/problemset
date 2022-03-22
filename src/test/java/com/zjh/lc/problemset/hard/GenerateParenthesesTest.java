package com.zjh.lc.problemset.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {

    private GenerateParentheses instance = new GenerateParentheses();

    @Test
    public void generateParentheses() {
        int n = 3;
        List<String> result = instance.generateParentheses(5);
        result.stream().forEach(System.out::println);
    }
}
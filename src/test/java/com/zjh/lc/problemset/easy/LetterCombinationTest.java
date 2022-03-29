package com.zjh.lc.problemset.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


public class LetterCombinationTest {

    private LetterCombination letterCombination = new LetterCombination();

    @Test
    public void combineNumbers() {
        List<String> results = letterCombination.combineNumbers("678");
        results.stream().forEach(System.out::println);
        assertEquals(36, letterCombination.getResults().size());
    }
}
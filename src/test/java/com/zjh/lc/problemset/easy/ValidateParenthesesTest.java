package com.zjh.lc.problemset.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidateParenthesesTest {

    private ValidateParentheses instance = new ValidateParentheses();

    @Test
    public void testValidateTrue() {
        String input = "()[]{}";
        boolean result = instance.validate(input);
        assertTrue(result);
    }

    @Test
    public void testValidateFalse() {
        String input = "([)]";
        boolean result = instance.validate(input);
        assertFalse(result);
    }
}
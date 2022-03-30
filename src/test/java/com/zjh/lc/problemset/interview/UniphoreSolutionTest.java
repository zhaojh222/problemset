package com.zjh.lc.problemset.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniphoreSolutionTest {

    private UniphoreSolution instance = new UniphoreSolution(3);

    @Test
    void addUrl() {
        instance.addUrl("a");
        instance.addUrl("b");
        instance.addUrl("c");
        instance.addUrl("b");

        instance.printUrls();
    }
}
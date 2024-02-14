package com.zjh.lc.problemset.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayRotatorTest {

    ArrayRotator rotator = new ArrayRotator();

    @Test
    public void testRotateArray() {
        int[][] array = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        rotator.rotateArray(array);
        rotator.printArray(array);
    }

    @Test
    public void testRotateArray2() {
        int[][] array = new int[][] {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        int[][] result = rotator.rotateArray2(array);
        rotator.printArray(result);
    }
}
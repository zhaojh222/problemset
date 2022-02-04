package com.zjh.lc.problemset.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayRotatorTest {

    @Test
    public void testRotateArray() {
        int[][] array = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        ArrayRotator rotator = new ArrayRotator();
        rotator.rotateArray(array);
        for(int  i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.printf("%d\t",array[i][j]);
            }
            System.out.println();
        }
    }
}
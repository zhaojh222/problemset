package com.zjh.lc.problemset.medium;

public class ArrayRotator {

    public void rotateArray(int[][] array) {
        int size = array.length;
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                int tmp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = tmp;
            }
        }
    }
}

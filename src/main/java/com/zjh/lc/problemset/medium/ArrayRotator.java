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

    /**
     * Rotate an array when i,j is different
     * @param array
     * @return
     */
    public int[][] rotateArray2(int[][] array) {
        int l1 = array.length;
        int l2 = array[0].length;
        int[][] result = new int[l2][l1];

        for(int i=0;i<l1;i++) {
            for(int j=0;j<l2;j++) {
                result[j][i] = array[i][j];
            }
        }
        return result;
    }

    public void printArray(int[][] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

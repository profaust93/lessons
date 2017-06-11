package com.javaguru.lesson4;

public class Array2DExample {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        array = ArrayUtils.fill2ndArray(array);
        ArrayUtils.print2DArray(array);
    }
}

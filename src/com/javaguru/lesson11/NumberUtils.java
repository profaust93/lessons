package com.javaguru.lesson11;

public class NumberUtils {

    public static int findMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

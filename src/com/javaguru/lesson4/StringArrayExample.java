package com.javaguru.lesson4;

import static com.javaguru.lesson4.ArrayUtils.*;

public class StringArrayExample {

    public static void main(String[] args) {
        int length = getNumberFromUser();
        String[] strings = createStringArray(length);
        strings = fillStringArray(strings);
        printStringArray(strings);
        System.out.println();
        printValidStrings(strings);
    }
}

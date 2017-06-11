package com.javaguru.lesson4;

import static com.javaguru.lesson4.ArrayUtils.*;


public class ArrayExample {

    public static void main(String[] args) {
        int length = getNumberFromUser();
        int[] array = createArray(length);

        System.out.println("ARRAY LENGTH = " + array.length);

        array = fillArray(array);
        printArray(array);
    }

}

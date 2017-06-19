package com.javaguru.lesson5;

public class StringToCharArray {


    public static void main(String[] args) {
        String str = "asdkjbakjdbj 21312 3jhb1 hj2b3j 12";
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
        }
    }
}

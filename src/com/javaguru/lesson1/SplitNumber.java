package com.javaguru.lesson1;

public class SplitNumber {
    public static void main(String[] args) {
        int number = 1234;

        System.out.println("Number = " + number);

        int four = number % 10;
        System.out.println(four);

        number = number / 10;

        int three = number % 10;
        System.out.println(three);

        number = number / 10;

        int two = number % 10;
        System.out.println(two);

        number = number / 10;

        int one = number;
        System.out.println(one);
    }

}

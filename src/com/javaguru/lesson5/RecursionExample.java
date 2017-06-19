package com.javaguru.lesson5;

public class RecursionExample {

    public static void main(String[] args) {
        printNumber(0);
    }

    public static void printNumber(int number) {
        if (number == 3) {
            return;
        }
        System.out.println(number);
        printNumber(++number);
    }
}

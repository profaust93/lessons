package com.javaguru.lesson11;

public class TestExample {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        int result = NumberUtils.findMax(10, 5);
        printTestResult(result == 10);
    }

    public static void test2() {
        boolean result = NumberUtils.isEven(10);
        printTestResult(result);
    }

    public static void printTestResult(boolean result) {
        if (result) {
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }
    }

}

package com.javaguru.lesson3;


import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        printToConsole("Hello!");
        int firstNumber = getNumberFromUser();
        int secondNumber = getNumberFromUser();
        int result = getMaxOfTwoNumbers(firstNumber, secondNumber);
        printToConsole("Max = " + result);
        if (isEven(result)) {
            printToConsole("Even");
        } else {
            printToConsole("Odd");
        }

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getMaxOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }

    public static void printToConsole(String text) {
        System.out.println(text);
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

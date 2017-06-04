package com.javaguru.lesson3;

import java.util.Scanner;

public class PowExample {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int userNumber = getNumberFromUser();

        System.out.println("Enter power");
        int power = getNumberFromUser();

        int result = pow(userNumber, power);

        System.out.println(result);
    }

    public static int pow(int number, int power) {
        int result = 1;
        for (int i = 0; i <= power; i++) {
            result = result * number;
//            number *= number;
        }
        return result;
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

package com.javaguru.lesson2;

import java.util.Scanner;

public class AIfEqualsZero {

    public static void main(String[] args) {
        int numberFromUser = getNumberFromUser();

        if (numberFromUser == 0) {
            System.out.println("ZERO");
        } else {
            System.out.println("NOT ZERO");
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, enter number:");
        int a = scanner.nextInt();
        return a;
    }

}

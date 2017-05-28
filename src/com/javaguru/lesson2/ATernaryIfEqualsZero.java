package com.javaguru.lesson2;

import java.util.Scanner;

public class ATernaryIfEqualsZero {

    public static final int ZERO = 0;

    public static void main(String[] args) {
        int numberFromUser = getNumberFromUser();
        String result = numberFromUser == ZERO ? "ZERO" : "NOT ZERO";
        System.out.println(result);

        if (numberFromUser > ZERO) {
            System.out.println("MORE THAN ZERO");
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, enter number:");
        int a = scanner.nextInt();
        return a;
    }
}

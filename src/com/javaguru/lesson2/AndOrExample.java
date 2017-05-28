package com.javaguru.lesson2;

import java.util.Scanner;

public class AndOrExample {

    public static void main(String[] args) {
        int numberFromUser = getNumberFromUser();

        if (numberFromUser > 10 && numberFromUser < 20) {
            System.out.println("More than 10 less than 20");
        } else if (numberFromUser == 5 || numberFromUser == 6) {
            System.out.println("6 or 5");
        } else {
            System.out.println("More than 20 or less than 10");
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, enter number:");
        int a = scanner.nextInt();
        return a;
    }
}

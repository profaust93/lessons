package com.javaguru.lesson2;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int numberFromUser = getNumberFromUser();

        boolean isEven = numberFromUser % 2 == 0;

        if (numberFromUser == 0) {
            System.out.println("ZERO");
        } else if (isEven) {
            double root = Math.sqrt(numberFromUser);
            System.out.println(root);
        } else {
            double square = Math.pow(numberFromUser, 2);
            System.out.println(square);
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

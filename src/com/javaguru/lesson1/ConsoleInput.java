package com.javaguru.lesson1;

import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello! Enter integer value: ");
        int intFromUser = scanner.nextInt();

        System.out.println("Integer value = " + intFromUser);

        int result = intFromUser * intFromUser;

        System.out.println("Result = " + result);
    }
}

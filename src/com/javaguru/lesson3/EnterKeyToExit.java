package com.javaguru.lesson3;

import java.util.Scanner;

public class EnterKeyToExit {

    public static void main(String[] args) {
        while (true) {
            printToConsole("Enter key to exit!");
            String key = "ruslan";
            String userString = getStringFromUser();
            if (key.equalsIgnoreCase(userString)) {
                break;
            }
        }
    }

    public static void printToConsole(String text) {
        System.out.println(text);
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

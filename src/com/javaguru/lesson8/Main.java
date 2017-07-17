package com.javaguru.lesson8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DBStringService service = new DBStringService();
        while (true) {
            String userInput = getUserInput();
            if (userInput.equals("")) {
                break;
            }
            service.addString(userInput);
        }
        System.out.println(service.getAllStrings());
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        return scanner.nextLine();
    }
}

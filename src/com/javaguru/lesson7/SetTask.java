package com.javaguru.lesson7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetTask {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        fillStringSet(strings);
        System.out.println(strings);
    }

    private static void fillStringSet(Set<String> strings) {
        while (true) {
            String userInput = getStringFromUser();
            if (userInput.equals("")) {
                break;
            }
            strings.add(userInput);
        }
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

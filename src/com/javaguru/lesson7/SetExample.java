package com.javaguru.lesson7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        String string = getStringFromUser();
        String string2 = getStringFromUser();

        Set<String> strings = new HashSet<>();
        strings.add(string);
        strings.add(string2);

        System.out.println(strings);
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

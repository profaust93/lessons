package com.javaguru.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTask {


    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        fillStringList(strings);
        System.out.println(strings);
    }

    private static void fillStringList(List<String> strings) {
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

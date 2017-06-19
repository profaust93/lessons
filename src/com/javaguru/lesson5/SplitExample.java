package com.javaguru.lesson5;

import java.util.Scanner;

public class SplitExample {

    public static void main(String[] args) {
        String words = getStringFromUser();
        System.out.println(words);
        String[] stringArray = words.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(i + " " + stringArray[i]);
        }

    }

    public static String getStringFromUser() {
        System.out.println("Enter any words");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

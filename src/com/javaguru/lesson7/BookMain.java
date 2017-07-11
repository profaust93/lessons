package com.javaguru.lesson7;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Ruslan");
        System.out.println(book);

        while (true) {
            String userInput = getStringFromUser();
            if (userInput.equals("")) {
                break;
            }
            String[] words = userInput.split(" ");

            for (String word : words) {
                book.addWord(word);
            }
        }
        System.out.println(book);
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

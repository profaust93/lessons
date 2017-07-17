package com.javaguru.lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<>();
        fillMap(words);

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println("KEY: " + entry.getKey());
            System.out.println("VALUE: " + entry.getValue());
        }
    }

    private static void fillMap(Map<String, Integer> words) {
        while (true) {
            String word = getUserInput();
            if (word.equals("")) {
                break;
            }
            if (words.containsKey(word)) {
                Integer count = words.get(word);
                count++;
                words.put(word, count);
            } else {
                words.put(word, 1);
            }
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        return scanner.nextLine();
    }
}

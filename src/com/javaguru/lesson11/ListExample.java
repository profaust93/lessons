package com.javaguru.lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello",
                "Bye",
                "Ruslan",
                "Oleg",
                "Vasya",
                "   ");

        strings.stream()
                .filter(str -> str.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println();

        List<String> filteredList =
                strings.stream()
                        .filter(str -> str.length() > 4)
                        .map(String::toLowerCase)
                        .collect(Collectors.toList());

        filteredList.forEach(str -> System.out.println(str));

        strings.stream()
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Logged: " + s))
                .map(str -> "Hello" + str)
                .forEach(System.out::println);
    }
}

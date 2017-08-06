package com.javaguru.lesson11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("11a", "Ruslan");
        map.put("12a", "Dima");
        map.put("1a", "Ruslan");
        map.put("31a", "Vasya");

        map.entrySet()
                .forEach(entry ->
                        System.out.println(entry.getKey() +
                                " " + entry.getValue()));

        map.keySet().stream()
                .filter(s -> s.equals("11a"))
                .forEach(System.out::println);
    }
}

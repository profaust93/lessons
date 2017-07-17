package com.javaguru.lesson8;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<Bird, String> map = new TreeMap<>();

        map.put(new Bird(10, "Vasyja"), "Chick-chirik");
        map.put(new Bird(5, "Vasya"), "Krja-Krja");
        map.put(new Bird(13, "Vasya2"), "Krja");

        System.out.println(map);
    }
}

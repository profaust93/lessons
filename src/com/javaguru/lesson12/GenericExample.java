package com.javaguru.lesson12;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        createList(integers, 4,5);

        System.out.println(integers);

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        createList(strings, "World", "Ruslan");

        System.out.println(strings);
    }

    private static <T> List<T> createList(List<T> oldList, T t0, T t1) {
        List<T> list = oldList;
        list.add(t0);
        list.add(t1);
        return list;
    }
}

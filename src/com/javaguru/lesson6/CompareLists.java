package com.javaguru.lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by javastar on 7/1/2017.
 */
public class CompareLists {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            persons.add(new Person("Dima"));
        }

        long start = System.currentTimeMillis();

        Person p = new Person("Vasya");

        for (int i = 0; i < persons.size(); i++) {
             p = persons.get(i);
        }

        System.out.println(p);

        long stop = System.currentTimeMillis();

        long result = stop - start;

        System.out.println(result + " ms");
    }
}

package com.javaguru.lesson6;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p = new Person("Vasya");
        persons.add(p);
        persons.add(new Person("Dima"));
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);

            System.out.println("Current name: " + person.getName());

            person.setName("Ivan");

            System.out.println("After: " + person.getName());
        }

        System.out.println(p);
    }
}

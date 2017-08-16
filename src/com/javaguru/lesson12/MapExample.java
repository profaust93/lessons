package com.javaguru.lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();

        Person person = new Person("Ruslan", 23);

        System.out.println(person.hashCode());

        map.put(person, person.getName());

        System.out.println(map.size());

        Person ruslan = new Person("Ruslan", 23);
        System.out.println(ruslan.hashCode());

        String name = map.get(ruslan);

        System.out.println(name);
        System.out.println(map.size());

    }
}

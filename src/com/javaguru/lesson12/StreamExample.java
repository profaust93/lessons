package com.javaguru.lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ruslan", 53));
        personList.add(new Person("Oleg", 35));
        personList.add(new Person("Anna", 18));
        personList.add(new Person("Kesha", 72));

        String names = getStringWithNames(personList);

        System.out.println(names);

        names = personList.stream()
                .map(person -> person.getName())
                .sorted(String::compareTo)
                .collect(Collectors.joining(", "));

        System.out.println(names);

        names = personList.stream()
                .map(person -> person.getName())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" "));

        System.out.println(names);

        int sumOfAges = getSumOfAges(personList);

        System.out.println(sumOfAges);

        sumOfAges = sumOfAges(personList);
        System.out.println(sumOfAges);

    }

    public static String getStringWithNames(List<Person> personList) {
        String names = "";
        for (int i = 0; i < personList.size(); i++) {
            names += personList.get(i).getName() + ", ";
        }
        return names;
    }

    public static int getSumOfAges(List<Person> personList) {
        int sumOfAges = 0;

        for (int i = 0; i < personList.size(); i++) {
            sumOfAges += personList.get(i).getAge();
        }

        return sumOfAges;
    }

    public static int sumOfAges(List<Person> personList) {
        return personList.stream()
                .map(person -> person.getAge())
                .reduce(0, (age0, age1) -> age0 + age1);
    }
}

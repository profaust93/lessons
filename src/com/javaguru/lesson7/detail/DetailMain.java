package com.javaguru.lesson7.detail;

import com.javaguru.lesson5.Person;

public class DetailMain {

    public static void main(String[] args) {
        Detail detail = new Detail(12, 12, 12);
        Person person = new Person("", 12);
        Detail detail2 = new Detail(31, 12, 12);
        Detail detail3 = new Detail(12, 12, 12);
        System.out.println(detail.equals(person));
        System.out.println(detail.equals(detail2));
        System.out.println(detail.equals(detail3));
    }
}

package com.javaguru.lesson5;

import java.math.BigDecimal;

public class World {

    public static void main(String[] args) {
        Person person = new Person("Ruslan", 231);

        System.out.println(person.getAge());

        Person secondPerson = new Person("Denis", 15, "male", 12.3,
                41.3, new BigDecimal(31.34).setScale(2, BigDecimal.ROUND_HALF_EVEN));

        System.out.println(secondPerson);
        secondPerson.sayHello();
    }
}

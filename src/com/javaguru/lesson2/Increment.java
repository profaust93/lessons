package com.javaguru.lesson2;

public class Increment {

    public static int number = 0;

    public static void main(String[] args) {
        number = number + 1;
        number++;
        number += 1;

        System.out.println(number);

        System.out.println(++number);
        System.out.println(number++);
        System.out.println(number);
    }
}

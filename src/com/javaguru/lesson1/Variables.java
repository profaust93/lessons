package com.javaguru.lesson1;

public class Variables {

    public static void main(String[] args) {

        int intNumber = 5;
        long longNumber = 978975413;

        double doubleNumber = 0.3;
        float floatNumber = 0.3f;

        char a = 'a';
        char c = 97;

        String hello = "Hello World";

        System.out.println("int = " + intNumber);
        System.out.println("long = " + longNumber);
        System.out.println("double = " + doubleNumber);
        System.out.println("float = " + floatNumber);
        System.out.println("char a = " + a);
        System.out.println("char c = " + c);

        System.out.println(hello);

        boolean yes = true;
        boolean no = false;

        System.out.println(yes);
        System.out.println(no);

        doubleNumber = doubleNumber - 0.1;
        System.out.println("double - 0.1 = " + doubleNumber);

        floatNumber = floatNumber - 0.1f;
        System.out.println("float - 0.1 = " + floatNumber);
    }
}

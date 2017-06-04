package com.javaguru.lesson3;

import java.util.Scanner;

public class VariablesVisibility {

    public static final int ZERO = 0;

    public int number = 5;

    public static void main(String[] args) {
        System.out.println(ZERO);

//        int a = AndOrExample.getNumberFromUser();
        int a = getNumberFromUser();

        if (a > 0) {
            int b = 15;
//            int a = 5;
            System.out.println(a);
            a = 20;
            System.out.println("NOW A = " + a);
            System.out.println(b);
        } else {
            int b = 13;
            System.out.println(b);
        }
    }

    public static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public int getNumber() {
        return number;
    }

}

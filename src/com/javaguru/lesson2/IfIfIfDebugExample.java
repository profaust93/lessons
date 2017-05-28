package com.javaguru.lesson2;


import java.util.Scanner;

public class IfIfIfDebugExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("ZERO");
        }

        if (number > 10) {
            System.out.println("More than 10");
            return;
        }

        if (number < 20) {
            System.out.println("Less than 20");
        }
    }
}

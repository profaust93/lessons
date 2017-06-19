package com.javaguru.lesson5;

public class StringExample {

    public static void main(String[] args) {
        String firstString = new String("ruslan");
        String secondString = new String("ruslan");

        if (firstString == secondString) {
            System.out.println("EQUALS!");
        } else {
            System.out.println("NOT EQUALS!");
        }

        String a = "a";
        String a2 = "a";
        if (a == a2) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUALS");
        }

        if (firstString.equals(secondString)) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUALS");
        }
    }
}

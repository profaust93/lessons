package com.javaguru.lesson3;


public class WhileExample {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
        int counter = 0;
        while (counter < 10) {
            if (counter == 3) {
                counter++;
                continue;
            }
            if (counter == 8) {
                break;
            }
            System.out.println("Counter = " + counter);
            counter++;
        }
    }
}

package com.javaguru.lesson9;


public class Eagle extends Bird {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Mouse");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying! =)");
    }
}

package com.javaguru.lesson9;

public abstract class Bird {

    private String name;

    public abstract void eat();

    public void fly(){
        System.out.println("...");
    }

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

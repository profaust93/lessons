package com.javaguru.lesson9;


public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "I'm penguin";
    }

    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void fly(){
        System.out.println("I can't fly! T_T ... jump jump");
    }
}

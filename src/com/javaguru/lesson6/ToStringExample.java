package com.javaguru.lesson6;


public class ToStringExample {

    public static void main(String[] args) {
        Car car = new Car(true, "Red", 240, "BMW");
        System.out.println(car.toString());
        System.out.println("Color: " + car.getColour());
        car.setColour("Black");
        System.out.println("Color: " + car.getColour());
        System.out.println("Cruise: " + car.isCruiseControl());
        upgradeCruiseControl(car);
        System.out.println("Cruise: " + car.isCruiseControl());

        int a = 5;
        System.out.println(a);
        addTwo(a);
        System.out.println(a);
        a = addTwo(a);
        System.out.println(a);
    }

    public static void upgradeCruiseControl(Car car){
        car.setCruiseControl(true);
    }

    public static int addTwo(int a) {
        a = a + 2;
        return a;
    }
}

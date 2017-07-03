package com.javaguru.lesson6;


public class Car {

    private boolean isNew;
    private String colour;
    private boolean isInMotion;
    private double maxSpeed;
    private String model;
    private boolean isCruiseControl;

    public Car(boolean isNew, String colour, double maxSpeed, String model) {
        this.isNew = isNew;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isInMotion() {
        return isInMotion;
    }

    public void setInMotion(boolean inMotion) {
        isInMotion = inMotion;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isCruiseControl() {
        return isCruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        isCruiseControl = cruiseControl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isNew=" + isNew +
                ", colour='" + colour + '\'' +
                ", isInMotion=" + isInMotion +
                ", maxSpeed=" + maxSpeed +
                ", model='" + model + '\'' +
                ", isCruiseControl=" + isCruiseControl +
                '}';
    }
}

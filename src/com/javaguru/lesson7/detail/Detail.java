package com.javaguru.lesson7.detail;

import java.util.Objects;

public class Detail {

    private int height;
    private int width;
    private int weight;

    public Detail(int height, int width, int weight) {
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "height=" + height +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return height == detail.height &&
                width == detail.width &&
                weight == detail.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, weight);
    }
}

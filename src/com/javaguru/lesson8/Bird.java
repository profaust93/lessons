package com.javaguru.lesson8;

public class Bird implements Comparable<Bird> {

    private int weight;
    private String name;

    public Bird(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;

        Bird bird = (Bird) o;

        if (getWeight() != bird.getWeight()) return false;
        return name != null ? name.equals(bird.name) : bird.name == null;

    }

    @Override
    public int hashCode() {
        int result = getWeight();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Bird o) {
        return Integer.compare(weight, o.getWeight());
    }
}

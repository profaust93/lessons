package com.javaguru.lesson9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BirdMain {

    public static void main(String[] args) {
        Eagle eagle = new Eagle("Eagle");
        Bird birdEagle = new Eagle("Eagle2");
        Penguin penguin = new Penguin("Penguin");

        List<Bird> birds = new ArrayList<>();
        birds.add(eagle);
        birds.add(penguin);
        birds.add(birdEagle);

        fly(birds);
        eat(birds);
    }

    public static void fly(List<Bird> birds){
        birds.forEach(bird -> bird.fly());
    }

    public static void eat(List<Bird> birds){
        birds.forEach(Bird::eat);
    }
}


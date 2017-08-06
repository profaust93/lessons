package com.javaguru.lesson11;

public interface DefaultInterfaceExample {

    String getString();

    default String getHello() {
        return "Hello";
    }
}

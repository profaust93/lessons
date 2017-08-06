package com.javaguru.lesson11;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String str = "Hello";

        Optional.ofNullable(str)
                .ifPresent(s -> System.out.println(s));

        Optional<String> stringOptional = Optional.ofNullable(str);

        String defHello = stringOptional.orElse("default hello");

        if (stringOptional.isPresent()) {
            String customString = stringOptional.get();
        }

        stringOptional.orElseThrow(() -> new RuntimeException());
    }
}
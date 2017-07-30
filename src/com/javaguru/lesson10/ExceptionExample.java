package com.javaguru.lesson10;


import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            throwException();
            System.out.println("Hello");
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.getCause().getMessage());
        }
    }

    private static void throwException() throws Exception {
        throw new Exception("123");
    }

    private static void throwCustomException() throws CustomException {
        throw new CustomException("123");
    }

    private static void throwRuntimeException(){
        throw new RuntimeException("Something going wrong...");
    }
}

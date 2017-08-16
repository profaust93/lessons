package com.javaguru.lesson12.registration;

public interface Validator<T> {

    void validate(T t);

    default <T> void assertNotNull(T field) {
        if (field == null) {
            throw new ValidationException("Cannot be null!");
        }
    }

    default void validateLength(String str) {
        if (str.length() < 2) {
            throw new ValidationException("String length cannot be less than 3");
        }
    }

    class ValidationException extends RuntimeException {
        public ValidationException(String message) {
            super(message);
        }
    }
}

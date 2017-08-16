package com.javaguru.lesson12.registration;

public class CustomerNameValidator implements Validator<Customer> {
    @Override
    public void validate(Customer customer) {
        assertNotNull(customer.getName());
        validateLength(customer.getName());
    }
}

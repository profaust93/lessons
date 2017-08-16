package com.javaguru.lesson12.registration;

import java.util.HashSet;
import java.util.Set;

public class CustomerValidator implements Validator<Customer> {

    private Set<Validator<Customer>> validators = new HashSet<>();

    public CustomerValidator(Set<Validator<Customer>> validators) {
        this.validators = validators;
    }

    public void addValidator(Validator<Customer> validator) {
        this.validators.add(validator);
    }

    @Override
    public void validate(Customer customer) {
        assertNotNull(customer);
        validators.forEach(validator -> validator.validate(customer));
    }
}

package com.javaguru.lesson12.registration;

import java.util.HashSet;
import java.util.Set;

public class CustomerMain {

    public static void main(String[] args) {
        Set<Validator<Customer>> validators = new HashSet<>();
        validators.add(new CustomerNameValidator());
        validators.add(new CustomerEmailValidator());
        Customer customer = new Customer();
        customer.setName("asdded");
        customer.setEmail("a@a.lv");

        Validator<Customer> validator = new CustomerValidator(validators);

        validator.validate(customer);
    }
}

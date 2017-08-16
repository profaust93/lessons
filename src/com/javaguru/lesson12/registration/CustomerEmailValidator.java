package com.javaguru.lesson12.registration;

import java.util.Arrays;
import java.util.List;

public class CustomerEmailValidator implements Validator<Customer> {

    @Override
    public void validate(Customer customer) {
        assertNotNull(customer.getEmail());
        List<String> strings = Arrays.asList(customer.getEmail().split("@"));
        validateSize(strings);
        strings.forEach(str -> validateLength(str));
    }

    private void validateSize(List<String> emailParts) {
        if (emailParts.size() != 2) {
            throw new ValidationException("Invalid email!");
        }
    }


}

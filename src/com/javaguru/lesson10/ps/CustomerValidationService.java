package com.javaguru.lesson10.ps;

import java.math.BigDecimal;

public class CustomerValidationService {

    public void checkCustomerOnCreate(Customer customer) {
        checkCustomerIsNotNull(customer);
        checkIdIsNotNull(customer.getId());
        checkIdIsNotLessThanZero(customer.getId());
        checkAmountIsNotNull(customer.getBalance());
        checkAmountIsMoreThanZero(customer.getBalance());
    }



    public void checkCustomerIsNotNull(Customer customer) {
        if (customer == null) {
            throw new CustomerValidationException("Customer is null!");
        }
    }

    public void checkAmountIsMoreThanZero(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new CustomerValidationException("Amount less/eq zero!");
        }
    }

    public void checkAmountIsNotNull(BigDecimal amount) {
        if (amount == null) {
            throw new CustomerValidationException("Amount is null!");
        }
    }

    public void checkCustomerId(Long id){
        checkIdIsNotNull(id);
        checkIdIsNotLessThanZero(id);
    }

    private void checkIdIsNotNull(Long id) {
        if (id == null) {
            throw new CustomerValidationException("Id is null!");
        }
    }

    private void checkIdIsNotLessThanZero(Long id) {
        if (id <= 0) {
            throw new CustomerValidationException("Id must be more than zero!");
        }
    }
}

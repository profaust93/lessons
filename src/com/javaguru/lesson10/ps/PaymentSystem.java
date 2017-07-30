package com.javaguru.lesson10.ps;

import java.math.BigDecimal;

public class PaymentSystem {

    public CustomerValidationService customerValidationService;
    public Database database;

    public PaymentSystem() {
        customerValidationService = new CustomerValidationService();
        database = new Database();
    }

    public void createCustomer(Long id, BigDecimal balance) {
        Customer customer = new Customer(id, balance);
        try {
            customerValidationService.checkCustomerOnCreate(customer);
            database.save(customer);
            System.out.println("Customer created!");
        } catch (CustomerValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public void send(Long idFrom, Long idTo, BigDecimal amount){
        customerValidationService.checkCustomerId(idFrom);
        customerValidationService.checkCustomerId(idTo);

        Customer customerFrom = database.getCustomerById(idFrom);
        Customer customerTo = database.getCustomerById(idTo);

        customerValidationService.checkCustomerIsNotNull(customerFrom);
        customerValidationService.checkCustomerIsNotNull(customerTo);

        customerValidationService.checkAmountIsNotNull(amount);
        customerValidationService.checkAmountIsMoreThanZero(amount);
    }
}

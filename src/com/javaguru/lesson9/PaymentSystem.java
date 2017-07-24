package com.javaguru.lesson9;

import java.math.BigDecimal;

public class PaymentSystem {

    private Database database;

    public PaymentSystem() {
        database = new Database();
    }

    public void addCustomer(Customer customer){
        database.saveOrUpdate(customer);
    }

    public void send(Long idFrom, Long idTo, BigDecimal amount) {
        Customer from = database.getCustomer(idFrom);
        Customer to = database.getCustomer(idTo);

        if (!isSuccessfullyValidated(from, to, amount)) {
            return;
        }

        BigDecimal currentBalanceFrom = from.getBalance();
        BigDecimal finalBalanceFrom = currentBalanceFrom.subtract(amount);
        BigDecimal currentBalanceTo = to.getBalance();
        BigDecimal finalBalanceTo = currentBalanceTo.add(amount);

        to.setBalance(finalBalanceTo);
        from.setBalance(finalBalanceFrom);

        if(isValidFinalBalance(finalBalanceFrom) && isValidFinalBalance(finalBalanceTo)){
            database.saveOrUpdate(to);
            database.saveOrUpdate(from);
        }
    }

    //next step: try on exceptions
    private boolean isSuccessfullyValidated(Customer from,
                                            Customer to,
                                            BigDecimal amount) {
        if (!isValidCustomer(from)) {
            return false;
        }
        if (!isValidCustomer(to)) {
            return false;
        }
        if (!isValidAmount(amount)) {
            return false;
        }
        if (!isValidFinalBalance(from.getBalance())) {
            return false;
        }

        return true;
    }

    private boolean isValidCustomer(Customer customer) {
        if (customer == null) {
            System.out.println("Customer with id=%d does not exist!");
            return false;
        }
        return true;
    }

    private boolean isValidAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Incorrect amount");
            return false;
        }
        return true;
    }

    private boolean isValidFinalBalance(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Final balance cannot be less than zero");
            return false;
        }
        return true;
    }
}

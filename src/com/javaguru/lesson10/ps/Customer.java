package com.javaguru.lesson10.ps;

import java.math.BigDecimal;

public class Customer {

    private Long id;
    private BigDecimal balance;

    public Customer(Long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}

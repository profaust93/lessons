package com.javaguru.lesson9;

import java.math.BigDecimal;

public class PaymentSystemMain {

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();

        Customer from = new Customer(1L, null);
        Customer to = new Customer(2L, BigDecimal.ZERO);

        paymentSystem.addCustomer(from);
        paymentSystem.addCustomer(to);

        paymentSystem.send(from.getId(), to.getId(), null);

    }
}

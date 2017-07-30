package com.javaguru.lesson10.ps;

import java.math.BigDecimal;

public class PaymentSystemMain {

    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
//        paymentSystem.createCustomer(null, null);
//        paymentSystem.createCustomer(-1L, null);
//        paymentSystem.createCustomer(0L, null);
//        paymentSystem.createCustomer(10L, null);
//        paymentSystem.createCustomer(10L, new BigDecimal("-1"));
//        paymentSystem.createCustomer(10L, new BigDecimal(0L));
//        paymentSystem.createCustomer(10L, new BigDecimal(0.000D));
        paymentSystem.createCustomer(10L, new BigDecimal(15.34));
        paymentSystem.createCustomer(11L, new BigDecimal(150.34));
        paymentSystem.send(10L, 11L, new BigDecimal("3000.00"));

    }
}

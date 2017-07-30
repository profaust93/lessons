package com.javaguru.lesson10.ps;

import java.util.HashMap;
import java.util.Map;


public class Database {

    private Map<Long, Customer> storage;

    public Database() {
        storage = new HashMap<>();
    }

    public void save(Customer customer) {
        storage.put(customer.getId(), customer);
    }

    public Customer getCustomerById(Long id) {
        return storage.get(id);
    }
}

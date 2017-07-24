package com.javaguru.lesson9;

import java.util.HashMap;
import java.util.Map;


public class Database {

    private Map<Long, Customer> storage;

    public Database() {
        storage = new HashMap<>();
    }

    public void saveOrUpdate(Customer customer) {
        System.out.println("saveOrUpdate: " + customer);
        storage.put(customer.getId(), customer);
    }

    public Customer getCustomer(Long id){
        return storage.get(id);
    }
}

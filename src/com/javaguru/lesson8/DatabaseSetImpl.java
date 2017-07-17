package com.javaguru.lesson8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DatabaseSetImpl implements Database {

    private Set<String> storage;

    public DatabaseSetImpl() {
        storage = new HashSet<>();
    }

    @Override
    public void save(String string) {
        storage.add(string);
    }

    @Override
    public List<String> getAllStrings() {
        return new ArrayList<>(storage);
    }
}

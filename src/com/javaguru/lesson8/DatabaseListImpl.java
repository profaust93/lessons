package com.javaguru.lesson8;

import java.util.ArrayList;
import java.util.List;

public class DatabaseListImpl implements Database{

    private List<String> storage;

    public DatabaseListImpl() {
        storage = new ArrayList<>();
    }

    @Override
    public void save(String string) {
        storage.add(string);
    }

    @Override
    public List<String> getAllStrings() {
        return storage;
    }
}

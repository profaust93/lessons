package com.javaguru.lesson8;

import java.util.List;

public class DBStringService {

    private final Database database;

    public DBStringService() {
        database = new DatabaseSetImpl();
    }

    public void addString(String string) {
        if (string == null) {
            System.out.println("NullPointer");
        } else if (string.equals("")) {
            System.out.println("Empty string");
        } else {
            database.save(string);
        }
    }

    public List<String> getAllStrings() {
        return database.getAllStrings();
    }
}

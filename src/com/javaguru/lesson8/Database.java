package com.javaguru.lesson8;

import java.util.List;

public interface Database {

    void save(String string);

    List<String> getAllStrings();
}

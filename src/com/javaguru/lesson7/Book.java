package com.javaguru.lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Book {

    private String author;
    private List<String> words;
    private Set<String> uqWords;

    public Book(String author) {
        this.author = author;
        words = new ArrayList<>();
        uqWords = new HashSet<>();
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getWords() {
        return words;
    }

    public Set<String> getUqWords() {
        return uqWords;
    }

    public void addWord(String word) {
        uqWords.add(word);
        words.add(word);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", words=" + words +
                ", uqWords=" + uqWords +
                '}';
    }
}

package com.JavaLearning;

public class Book {
    private String name;

    public Book (String name) {
        this.name = name;
        System.out.println("Book name: " + name);
    }

    public String getName() {
        return this.name;
    }
}

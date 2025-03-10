package com.JavaLearning;

public class BookMain {
    public static void main(String[] args) {
        Book theBook = new Book("Harry Potter");
        System.out.println("Book name: " + theBook.getName());
//        theBook.setName("Lord of the Rings");
        System.out.println("Book name: " + theBook.setName("Lord of the Rings"));
    }
}

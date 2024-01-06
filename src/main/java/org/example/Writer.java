package org.example;

public class Writer {
    private int writerId;
    private String firstname;
    private String lastname;
    private int age;
    Books[] books;

    public Writer() {
    }

    public Writer(String firstname, String lastname, int age, Books[] books) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.books = books;
    }
}

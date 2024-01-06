package org.example;

public class Books {
    private int bookId;
    private String bookName;
    private int yearOfPublish;
    private int writer;

    public Books() {
    }

    public Books(String bookName, int yearOfPublish, int writer) {
        this.bookName = bookName;
        this.yearOfPublish = yearOfPublish;
        this.writer = writer;
    }
}

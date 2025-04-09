package com.xworkz.tostring.inner;

public class Book {
    private String title;
    private String author;
    private double pages;

    public Book(String title, String author, double pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pages=" + pages + "]";
    }
}

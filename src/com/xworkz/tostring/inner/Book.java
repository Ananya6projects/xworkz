package com.xworkz.tostring.inner;

public class Book {
    private String title;
    private int author;
    private boolean pages;

    public Book(String title, int author, boolean pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pages=" + pages + "]";
    }
    @Override
    public int hashCode() {
        return 6;
    }
}


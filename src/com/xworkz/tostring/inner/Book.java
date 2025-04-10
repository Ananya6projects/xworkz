package com.xworkz.tostring.inner;

public class Book {
    private String title;
<<<<<<< HEAD
    private int author;
    private boolean pages;

    public Book(String title, int author, boolean pages) {
=======
    private String author;
    private double pages;

    public Book(String title, String author, double pages) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pages=" + pages + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 6;
    }
}

=======
}
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26

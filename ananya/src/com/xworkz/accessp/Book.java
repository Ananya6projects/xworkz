package com.xworkz.accessp;

public class Book {
    public String author = "James Gosling";
    public String genre = "Programming";
    private int pages = 400;

    public void showTitle() {
        System.out.println("Book Genre: " + this.genre);
    }

    private void showPages() {
        System.out.println("Total Pages: " + this.pages);
    }
}

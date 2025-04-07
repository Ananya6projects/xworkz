package com.xworkz.inheritances1.internal;

public class Book {
    public Book() {
        System.out.println("Book --parent");
    }

    public void turnOn() {
        System.out.println("Opening the book...");
    }

    public void operate() {
        System.out.println("Reading the book...");
    }

    public void connect() {
        System.out.println("Connecting ideas through chapters...");
    }

    public void performTask() {
        System.out.println("Delivering knowledge...");
    }

    public void shutDown() {
        System.out.println("Closing the book...");
    }
}

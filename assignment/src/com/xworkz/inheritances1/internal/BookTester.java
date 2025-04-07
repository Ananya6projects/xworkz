package com.xworkz.inheritances1.internal;

public class BookTester {
    public void test(Book book) {
        System.out.println("Testing book...");
        book.turnOn();
        book.operate();
        book.connect();
        book.performTask();
        book.shutDown();

        if (book instanceof StoryBook) {
            System.out.println("Book is a StoryBook -- casting and invoking specific method");
            StoryBook sb = (StoryBook) book;
            sb.narrateStory();
        }
    }
}

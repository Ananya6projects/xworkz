package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.Book;
import com.xworkz.inheritances1.internal.StoryBook;
import com.xworkz.inheritances1.internal.BookTester;

public class BookRunner {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.turnOn();
        book1.operate();
        book1.connect();
        book1.performTask();
        book1.shutDown();

        System.out.println("-----------");

        Book book2 = new StoryBook();
        book2.turnOn();
        book2.operate();
        book2.connect();
        book2.performTask();
        book2.shutDown();

        System.out.println("-----------");

        StoryBook storyBook = new StoryBook();
        storyBook.turnOn();
        storyBook.operate();
        storyBook.connect();
        storyBook.performTask();
        storyBook.shutDown();

        System.out.println("------casting------");

        BookTester tester = new BookTester();
        tester.test(book1);
        tester.test(book2);
        tester.test(storyBook);
    }
}

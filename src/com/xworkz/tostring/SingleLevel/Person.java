package com.xworkz.tostring.SingleLevel;

public class Person {
    void speak() {
        System.out.println("Person is speaking");
    }
    class Student extends Person {
        void study() {
            System.out.println("Student is studying");
        }
    }
}

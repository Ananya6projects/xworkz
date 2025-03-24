package com.xworkz.accessp;

public class Person {
    public String name = "Ananya";
    private int age = 20;

    public void displayName() {
        System.out.println("Name: " + this.name);
    }

    private void displayAge() {
        System.out.println("Age: " + this.age);
    }
}

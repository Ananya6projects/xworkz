package com.xworkz.accessp;

public class Animal {
    public String habitat = "Forest";
    public String type = "Dog";
    private int age = 5;

    public void showType() {
        System.out.println("Animal Type: " + this.type);
    }

    private void showAge() {
        System.out.println("Animal Age: " + this.age);
    }
}

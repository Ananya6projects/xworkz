package com.xworkz.inheritances1.internal;

public class Shoe {
    public Shoe() {
        System.out.println("Shoe --parent");
    }

    public void turnOn() {
        System.out.println("Shoe is being laced up...");
    }

    public void operate() {
        System.out.println("Shoe is being worn...");
    }

    public void connect() {
        System.out.println("Shoe is adjusting to foot shape...");
    }

    public void performTask() {
        System.out.println("Shoe is providing comfort and grip...");
    }

    public void shutDown() {
        System.out.println("Shoe is taken off and stored...");
    }
}

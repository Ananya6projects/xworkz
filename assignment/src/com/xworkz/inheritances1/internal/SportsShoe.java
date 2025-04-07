package com.xworkz.inheritances1.internal;

public class SportsShoe extends Shoe {
    public SportsShoe() {
        super();
        System.out.println("SportsShoe --child");
    }

    @Override
    public void turnOn() {
        System.out.println("SportsShoe is tightened for performance --child");
    }

    @Override
    public void operate() {
        System.out.println("SportsShoe is used in running and workouts --child");
    }

    @Override
    public void connect() {
        System.out.println("SportsShoe connects with smart tracking chip --child");
    }

    @Override
    public void performTask() {
        System.out.println("SportsShoe supports fast movement --child");
    }

    @Override
    public void shutDown() {
        System.out.println("SportsShoe is cleaned and kept aside --child");
    }

    public void cleanShoe() {
        System.out.println("SportsShoe is being cleaned with soft brush...");
    }
}

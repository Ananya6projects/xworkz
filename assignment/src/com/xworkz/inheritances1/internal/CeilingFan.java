package com.xworkz.inheritances1.internal;

public class CeilingFan extends Fan {
    public CeilingFan() {
        super();
        System.out.println("CeilingFan --child");
    }

    @Override
    public void turnOn() {
        System.out.println("CeilingFan is turned on with a switch --child");
    }

    @Override
    public void operate() {
        System.out.println("CeilingFan spins silently --child");
    }

    @Override
    public void connect() {
        System.out.println("CeilingFan connected to the ceiling wiring --child");
    }

    @Override
    public void performTask() {
        System.out.println("CeilingFan circulates air evenly --child");
    }

    @Override
    public void shutDown() {
        System.out.println("CeilingFan slows down and stops --child");
    }

    public void changeSpeed() {
        System.out.println("CeilingFan speed is being changed...");
    }
}

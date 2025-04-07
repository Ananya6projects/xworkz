package com.xworkz.inheritances1.internal;

public class WaterBottle extends Bottle {
    public WaterBottle() {
        super();
        System.out.println("WaterBottle --child");
    }

    @Override
    public void turnOn() {
        System.out.println("WaterBottle lid flips open --child");
    }

    @Override
    public void operate() {
        System.out.println("WaterBottle dispenses cool water --child");
    }

    @Override
    public void connect() {
        System.out.println("WaterBottle keeps you hydrated --child");
    }

    @Override
    public void performTask() {
        System.out.println("WaterBottle provides fresh water --child");
    }

    @Override
    public void shutDown() {
        System.out.println("WaterBottle is sealed tightly --child");
    }

    public void refill() {
        System.out.println("WaterBottle is being refilled...");
    }
}

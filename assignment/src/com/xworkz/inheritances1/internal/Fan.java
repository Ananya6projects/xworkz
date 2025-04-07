package com.xworkz.inheritances1.internal;

public class Fan {
    public Fan() {
        System.out.println("Fan --parent");
    }

    public void turnOn() {
        System.out.println("Fan is turning on...");
    }

    public void operate() {
        System.out.println("Fan is rotating...");
    }

    public void connect() {
        System.out.println("Fan is connected to power...");
    }

    public void performTask() {
        System.out.println("Fan is cooling the room...");
    }

    public void shutDown() {
        System.out.println("Fan is shutting down...");
    }
}

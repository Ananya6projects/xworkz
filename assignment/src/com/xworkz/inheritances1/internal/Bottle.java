package com.xworkz.inheritances1.internal;

public class Bottle {
    public Bottle() {
        System.out.println("Bottle --parent");
    }

    public void turnOn() {
        System.out.println("Bottle cap is opened...");
    }

    public void operate() {
        System.out.println("Bottle is ready to pour...");
    }

    public void connect() {
        System.out.println("Bottle connects to hydration...");
    }

    public void performTask() {
        System.out.println("Bottle is used for drinking water...");
    }

    public void shutDown() {
        System.out.println("Bottle is closed and kept aside...");
    }
}

package com.xworkz.inheritances1.internal;

public class KitchenAppliance {
    public KitchenAppliance() {
        System.out.println("KitchenAppliance --parent");
    }

    public void turnOn() {
        System.out.println("KitchenAppliance is turning on...");
    }

    public void operate() {
        System.out.println("KitchenAppliance is operating...");
    }

    public void connect() {
        System.out.println("KitchenAppliance is connecting to power supply...");
    }

    public void performTask() {
        System.out.println("KitchenAppliance is performing its kitchen task...");
    }

    public void shutDown() {
        System.out.println("KitchenAppliance is shutting down...");
    }
}

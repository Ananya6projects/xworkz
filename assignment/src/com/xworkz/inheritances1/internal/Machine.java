package com.xworkz.inheritances1.internal;

public class Machine {
    public Machine() {
        System.out.println("Machine --parent");
    }

    public void turnOn() {
        System.out.println("Machine turning on...");
    }

    public void operate() {
        System.out.println("Machine operating...");
    }

    public void connect() {
        System.out.println("Machine connecting...");
    }

    public void performTask() {
        System.out.println("Machine performing task...");
    }

    public void shutDown() {
        System.out.println("Machine shutting down...");
    }
}

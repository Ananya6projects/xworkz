package com.xworkz.inheritances1.internal;

public class SmartWatch extends SmartDevice {
    public SmartWatch() {
        super();
        System.out.println("SmartWatch --child");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartWatch turns on with a tap --child");
    }

    @Override
    public void operate() {
        System.out.println("SmartWatch is tracking health stats --child");
    }

    @Override
    public void connect() {
        System.out.println("SmartWatch connects to phone --child");
    }

    @Override
    public void performTask() {
        System.out.println("SmartWatch monitors steps and heart rate --child");
    }

    @Override
    public void shutDown() {
        System.out.println("SmartWatch shuts down gracefully --child");
    }

    // ✅ Unique method (not overridden)
    public void showNotification() {
        System.out.println("SmartWatch displays a new message notification...");
    }
}

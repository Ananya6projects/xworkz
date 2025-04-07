package com.xworkz.inheritances1.internal;

public class SmartDevice {
    public SmartDevice() {
        System.out.println("SmartDevice --parent");
    }

    public void turnOn() {
        System.out.println("SmartDevice is powering on...");
    }

    public void operate() {
        System.out.println("SmartDevice is functioning...");
    }

    public void connect() {
        System.out.println("SmartDevice is connecting to Bluetooth...");
    }

    public void performTask() {
        System.out.println("SmartDevice is executing smart tasks...");
    }

    public void shutDown() {
        System.out.println("SmartDevice is shutting down...");
    }
}

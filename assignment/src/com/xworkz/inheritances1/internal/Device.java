package com.xworkz.inheritances1.internal;

public class Device {
    public Device() {
        System.out.println("Device --parent");
    }

    public void turnOn() {
        System.out.println("Device is turning on --parent");
    }

    public void operate() {
        System.out.println("Device is operating --parent");
    }

    public void connect() {
        System.out.println("Device connects to network --parent");
    }

    public void performTask() {
        System.out.println("Device performs a task --parent");
    }

    public void shutDown() {
        System.out.println("Device shuts down --parent");
    }
}

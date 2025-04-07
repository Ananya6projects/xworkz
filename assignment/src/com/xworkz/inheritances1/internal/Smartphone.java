package com.xworkz.inheritances1.internal;

public class Smartphone extends Device {
    public Smartphone() {
        super();
        System.out.println("Smartphone --child");
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone powers up instantly --child");
    }

    @Override
    public void operate() {
        System.out.println("Smartphone is being used for apps --child");
    }

    @Override
    public void connect() {
        System.out.println("Smartphone connects to 5G --child");
    }

    @Override
    public void performTask() {
        System.out.println("Smartphone runs multiple apps --child");
    }

    @Override
    public void shutDown() {
        System.out.println("Smartphone shuts down quickly --child");
    }

    public void takePhoto() {
        System.out.println("Smartphone takes a high-resolution photo");
    }

}


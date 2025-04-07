package com.xworkz.inheritances1.internal;

public class ElectricScooter extends TransportVehicle {
    public ElectricScooter() {
        super();
        System.out.println("ElectricScooter --child");
    }

    @Override
    public void turnOn() {
        System.out.println("ElectricScooter powers on silently --child");
    }

    @Override
    public void operate() {
        System.out.println("ElectricScooter is cruising through streets --child");
    }

    @Override
    public void connect() {
        System.out.println("ElectricScooter connects to mobile app --child");
    }

    @Override
    public void performTask() {
        System.out.println("ElectricScooter is moving the rider --child");
    }

    @Override
    public void shutDown() {
        System.out.println("ElectricScooter powers down --child");
    }


    public void activateEcoMode() {
        System.out.println("ElectricScooter switches to eco mode...");
    }
}

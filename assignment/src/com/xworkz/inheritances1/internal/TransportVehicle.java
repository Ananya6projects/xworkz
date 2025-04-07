package com.xworkz.inheritances1.internal;

public class TransportVehicle {
    public TransportVehicle() {
        System.out.println("TransportVehicle --parent");
    }

    public void turnOn() {
        System.out.println("TransportVehicle is starting up...");
    }

    public void operate() {
        System.out.println("TransportVehicle is being operated...");
    }

    public void connect() {
        System.out.println("TransportVehicle is connecting to GPS...");
    }

    public void performTask() {
        System.out.println("TransportVehicle is transporting people...");
    }

    public void shutDown() {
        System.out.println("TransportVehicle is shutting down...");
    }
}

package com.xworkz.inheritances1.internal;

public class MusicalInstrument {
    public MusicalInstrument() {
        System.out.println("MusicalInstrument --parent");
    }

    public void turnOn() {
        System.out.println("MusicalInstrument is turning on...");
    }

    public void operate() {
        System.out.println("MusicalInstrument is being played...");
    }

    public void connect() {
        System.out.println("MusicalInstrument is connecting to amplifier...");
    }

    public void performTask() {
        System.out.println("MusicalInstrument is performing music...");
    }

    public void shutDown() {
        System.out.println("MusicalInstrument is shutting down...");
    }
}

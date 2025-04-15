package com.xworkz.tostring.vehicle;

public abstract class Appliance {
    abstract void operate();

    void plugIn() {
        System.out.println("Appliance is plugged in.");
    }
}

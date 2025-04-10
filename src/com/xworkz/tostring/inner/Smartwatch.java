package com.xworkz.tostring.inner;

public class Smartwatch {
    private String model;
    private int batteryLife;
    private boolean fitnessTracking;

    public Smartwatch(String model, int batteryLife, boolean fitnessTracking) {
        this.model = model;
        this.batteryLife = batteryLife;
        this.fitnessTracking = fitnessTracking;
    }

    @Override
    public String toString() {
        return "Smartwatch [model=" + model + ", batteryLife=" + batteryLife + ", fitnessTracking=" + fitnessTracking + "]";
    }
    @Override
    public int hashCode() {
        return 11;
    }
}

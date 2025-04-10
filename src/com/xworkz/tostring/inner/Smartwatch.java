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
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 11;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

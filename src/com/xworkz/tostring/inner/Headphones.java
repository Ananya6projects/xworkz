package com.xworkz.tostring.inner;

public class Headphones {
    private String model;
    private int impedance;
    private boolean wireless;

    public Headphones(String model, int impedance, boolean wireless) {
        this.model = model;
        this.impedance = impedance;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones [model=" + model + ", impedance=" + impedance + ", wireless=" + wireless + "]";
    }
}

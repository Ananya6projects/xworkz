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
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 89;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

package com.xworkz.tostring.inner;

public class Bulb {
    private String propertyOne;
    private int propertyTwo;
<<<<<<< HEAD
    private boolean propertyThree;

    public Bulb(String propertyOne, int propertyTwo, boolean propertyThree) {
=======
    private double propertyThree;

    public Bulb(String propertyOne, int propertyTwo, double propertyThree) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Bulb [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 6;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

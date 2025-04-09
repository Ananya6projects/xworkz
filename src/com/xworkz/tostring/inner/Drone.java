package com.xworkz.tostring.inner;

public class Drone {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Drone(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Drone [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

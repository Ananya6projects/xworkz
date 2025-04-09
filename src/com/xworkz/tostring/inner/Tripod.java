package com.xworkz.tostring.inner;

public class Tripod {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Tripod(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Tripod [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

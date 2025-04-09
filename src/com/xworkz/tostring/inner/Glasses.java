package com.xworkz.tostring.inner;

public class Glasses {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Glasses(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Glasses [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

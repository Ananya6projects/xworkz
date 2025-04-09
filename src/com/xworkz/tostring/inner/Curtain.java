package com.xworkz.tostring.inner;

public class Curtain {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Curtain(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Curtain [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

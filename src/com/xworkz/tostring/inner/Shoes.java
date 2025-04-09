package com.xworkz.tostring.inner;

public class Shoes {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Shoes(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Shoes [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

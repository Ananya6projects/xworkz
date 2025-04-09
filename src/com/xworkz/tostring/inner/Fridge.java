package com.xworkz.tostring.inner;

public class Fridge {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Fridge(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Fridge [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

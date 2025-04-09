package com.xworkz.tostring.inner;

public class Skateboard {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Skateboard(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Skateboard [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

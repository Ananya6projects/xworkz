package com.xworkz.tostring.inner;

public class Bulb {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Bulb(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Bulb [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
    @Override
    public int hashCode() {
        return 6;
    }
}

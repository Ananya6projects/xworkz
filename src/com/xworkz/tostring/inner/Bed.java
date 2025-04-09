package com.xworkz.tostring.inner;

public class Bed {
    private String propertyOne;
    private String propertyTwo;
    private double propertyThree;

    public Bed(String propertyOne, String propertyTwo, double propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Bed [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

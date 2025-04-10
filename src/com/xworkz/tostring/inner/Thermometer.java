package com.xworkz.tostring.inner;

public class Thermometer {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Thermometer(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Thermometer [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
    @Override
    public int hashCode() {
        return 123;
    }
}

package com.xworkz.tostring.inner;

public class Bicycle {
    private String propertyOne;
    private int propertyTwo;
    private String propertyThree;

    public Bicycle(String propertyOne, int propertyTwo, String propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Bicycle [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

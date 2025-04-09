package com.xworkz.tostring.inner;

public class Calculator {
    private String propertyOne;
    private boolean propertyTwo;
    private String propertyThree;

    public Calculator(String propertyOne, boolean propertyTwo, String propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Calculator [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

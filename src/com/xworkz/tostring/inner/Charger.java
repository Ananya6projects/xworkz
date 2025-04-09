package com.xworkz.tostring.inner;

public class Charger {
    private String propertyOne;
    private String propertyTwo;
    private int propertyThree;

    public Charger(String propertyOne, String propertyTwo, int propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Charger [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

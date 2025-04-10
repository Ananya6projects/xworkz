package com.xworkz.tostring.inner;

public class Pillow {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Pillow(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Pillow [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
    @Override
    public int hashCode() {
        return 22;
    }
}

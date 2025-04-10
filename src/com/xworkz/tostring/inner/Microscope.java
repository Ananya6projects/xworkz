package com.xworkz.tostring.inner;

public class Microscope {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Microscope(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Microscope [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
    @Override
    public int hashCode() {
        return 870;
    }
}

package com.xworkz.tostring.inner;

public class LumenBox {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public LumenBox(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "LumenBox [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
    @Override
    public int hashCode() {
        return 100;
    }
}

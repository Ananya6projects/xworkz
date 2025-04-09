package com.xworkz.tostring.inner;

public class Notebook {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Notebook(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Notebook [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

package com.xworkz.tostring.inner;

public class Calculator {
    private String propertyOne;
<<<<<<< HEAD
    private int propertyTwo;
    private boolean propertyThree;

    public Calculator(String propertyOne, int propertyTwo, boolean propertyThree) {
=======
    private boolean propertyTwo;
    private String propertyThree;

    public Calculator(String propertyOne, boolean propertyTwo, String propertyThree) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Calculator [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 63;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

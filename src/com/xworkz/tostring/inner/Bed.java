package com.xworkz.tostring.inner;

public class Bed {
    private String propertyOne;
<<<<<<< HEAD
    private int propertyTwo;
    private boolean propertyThree;

    public Bed(String propertyOne, int propertyTwo, boolean propertyThree) {
=======
    private String propertyTwo;
    private double propertyThree;

    public Bed(String propertyOne, String propertyTwo, double propertyThree) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Bed [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 3;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

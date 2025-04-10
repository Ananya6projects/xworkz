package com.xworkz.tostring.inner;

public class Bicycle {
    private String propertyOne;
    private int propertyTwo;
<<<<<<< HEAD
    private boolean propertyThree;

    public Bicycle(String propertyOne, int propertyTwo, boolean propertyThree) {
=======
    private String propertyThree;

    public Bicycle(String propertyOne, int propertyTwo, String propertyThree) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Bicycle [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 4;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

package com.xworkz.tostring.inner;

public class Projector {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Projector(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Projector [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 22;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

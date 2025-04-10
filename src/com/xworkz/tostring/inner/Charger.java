package com.xworkz.tostring.inner;

public class Charger {
    private String propertyOne;
<<<<<<< HEAD
    private int propertyTwo;
    private boolean propertyThree;

    public Charger(String propertyOne, int propertyTwo, boolean propertyThree) {
=======
    private String propertyTwo;
    private int propertyThree;

    public Charger(String propertyOne, String propertyTwo, int propertyThree) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Charger [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 16;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

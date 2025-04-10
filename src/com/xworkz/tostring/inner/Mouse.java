package com.xworkz.tostring.inner;

public class Mouse {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Mouse(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Mouse [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 490;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

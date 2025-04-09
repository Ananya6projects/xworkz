package com.xworkz.tostring.inner;

public class Camera {
    private String propertyOne;
    private double propertyTwo;
    private boolean propertyThree;

    public Camera(String propertyOne, double propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Camera [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
}

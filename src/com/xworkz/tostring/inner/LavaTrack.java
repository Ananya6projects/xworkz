package com.xworkz.tostring.inner;

public class LavaTrack {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public LavaTrack(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "LavaTrack [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }
    @Override
    public int hashCode() {
        return 90;
    }
}

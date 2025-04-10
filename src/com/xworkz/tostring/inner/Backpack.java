package com.xworkz.tostring.inner;

public class Backpack {
    private String propertyOne;
    private int propertyTwo;
    private boolean propertyThree;

    public Backpack(String propertyOne, int propertyTwo, boolean propertyThree) {
        this.propertyOne = propertyOne;
        this.propertyTwo = propertyTwo;
        this.propertyThree = propertyThree;
    }

    @Override
    public String toString() {
        return "Backpack [propertyOne=" + propertyOne + ", propertyTwo=" + propertyTwo + ", propertyThree=" + propertyThree + "]";
    }

        @Override
        public int hashCode() {
            return 101;
        }
    }



package com.xworkz.tostring.inner;

public class Stapler {
    private String brand;
    private int pinCapacity;
    private boolean isHeavyDuty;

    public Stapler(String brand, int pinCapacity, boolean isHeavyDuty) {
        this.brand = brand;
        this.pinCapacity = pinCapacity;
        this.isHeavyDuty = isHeavyDuty;
    }

    @Override
    public String toString() {
        return "Stapler [brand=" + brand + ", pinCapacity=" + pinCapacity + ", isHeavyDuty=" + isHeavyDuty + "]";
    }
}

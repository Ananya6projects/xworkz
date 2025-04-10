package com.xworkz.tostring.inner;

public class RingLight {
    private String size;
    private int brightnessLevels;
    private boolean colorAdjustable;

    public RingLight(String size, int brightnessLevels, boolean colorAdjustable) {
        this.size = size;
        this.brightnessLevels = brightnessLevels;
        this.colorAdjustable = colorAdjustable;
    }

    @Override
    public String toString() {
        return "RingLight [size=" + size + ", brightnessLevels=" + brightnessLevels + ", colorAdjustable=" + colorAdjustable + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 47;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

package com.xworkz.tostring.inner;

public class Fan {
    private String brand;
    private int speedLevels;
    private boolean isCeilingFan;

    public Fan(String brand, int speedLevels, boolean isCeilingFan) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.isCeilingFan = isCeilingFan;
    }

    @Override
    public String toString() {
        return "Fan [brand=" + brand + ", speedLevels=" + speedLevels + ", isCeilingFan=" + isCeilingFan + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 77;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

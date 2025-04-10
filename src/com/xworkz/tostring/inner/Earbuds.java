package com.xworkz.tostring.inner;

public class Earbuds {
    private String color;
    private int batteryLife;
    private boolean noiseCancellation;

    public Earbuds(String color, int batteryLife, boolean noiseCancellation) {
        this.color = color;
        this.batteryLife = batteryLife;
        this.noiseCancellation = noiseCancellation;
    }

    @Override
    public String toString() {
        return "Earbuds [color=" + color + ", batteryLife=" + batteryLife + ", noiseCancellation=" + noiseCancellation + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 71;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

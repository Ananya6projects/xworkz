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
}

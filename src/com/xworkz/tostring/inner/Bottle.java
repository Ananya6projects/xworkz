package com.xworkz.tostring.inner;

public class Bottle {
    private String color;
    private double capacity;
    private boolean isInsulated;

    public Bottle(String color, double capacity, boolean isInsulated) {
        this.color = color;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "Bottle [color=" + color + ", capacity=" + capacity + "L, isInsulated=" + isInsulated + "]";
    }
}

package com.xworkz.tostring.inner;

public class Refrigerator {
    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Refrigerator(String brand, int capacity, boolean hasFreezer) {
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString() {
        return "Refrigerator [brand=" + brand + ", capacity=" + capacity + "L, hasFreezer=" + hasFreezer + "]";
    }
    @Override
    public int hashCode() {
        return 47;
    }
}

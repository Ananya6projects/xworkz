package com.xworkz.tostring.inner;

public class Laptop {
    private String brand;
    private int ram;
    private boolean hasSSD;

    public Laptop(String brand, int ram, boolean hasSSD) {
        this.brand = brand;
        this.ram = ram;
        this.hasSSD = hasSSD;
    }

    @Override
    public String toString() {

        return "Laptop [brand=" + brand + ", ram=" + ram + "GB, hasSSD=" + hasSSD + "]";
    }
    @Override
    public int hashCode() {
        return 10;
    }
}


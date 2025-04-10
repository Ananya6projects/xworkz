package com.xworkz.tostring.inner;

public class Chair {
    private String material;
    private double legs;
    private boolean hasCushion;

    public Chair(String material, double legs, boolean hasCushion) {
        this.material = material;
        this.legs = legs;
        this.hasCushion = hasCushion;
    }

    @Override
    public String toString() {
        return "Chair [material=" + material + ", legs=" + legs + ", hasCushion=" + hasCushion + "]";
    }
    @Override
    public int hashCode() {
        return 06;
    }
}

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
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 06;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

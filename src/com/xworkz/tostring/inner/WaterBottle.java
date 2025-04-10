package com.xworkz.tostring.inner;

public class WaterBottle {
    private String material;
    private int volume;
    private boolean insulated;

    public WaterBottle(String material, int volume, boolean insulated) {
        this.material = material;
        this.volume = volume;
        this.insulated = insulated;
    }

    @Override
    public String toString() {
        return "WaterBottle [material=" + material + ", volume=" + volume + ", insulated=" + insulated + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 123;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

package com.xworkz.tostring.inner;

public class Pen {
    private String inkColor;
<<<<<<< HEAD
    private int brand;
    private boolean isGel;

    public Pen(String inkColor, int brand, boolean isGel) {
=======
    private String brand;
    private boolean isGel;

    public Pen(String inkColor, String brand, boolean isGel) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.inkColor = inkColor;
        this.brand = brand;
        this.isGel = isGel;
    }

    @Override
    public String toString() {
<<<<<<< HEAD

        return "Pen [inkColor=" + inkColor + ", brand=" + brand + ", isGel=" + isGel + "]";
    }
    @Override
    public int hashCode() {
        return 80;
    }
=======
        return "Pen [inkColor=" + inkColor + ", brand=" + brand + ", isGel=" + isGel + "]";
    }
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

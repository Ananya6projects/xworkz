package com.xworkz.tostring.inner;

public class Pen {
    private String inkColor;
    private String brand;
    private boolean isGel;

    public Pen(String inkColor, String brand, boolean isGel) {
        this.inkColor = inkColor;
        this.brand = brand;
        this.isGel = isGel;
    }

    @Override
    public String toString() {
        return "Pen [inkColor=" + inkColor + ", brand=" + brand + ", isGel=" + isGel + "]";
    }
}

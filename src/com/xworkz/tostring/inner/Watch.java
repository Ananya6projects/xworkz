package com.xworkz.tostring.inner;

public class Watch {
    private String brand;
    private int isSmart;
    private boolean color;

    public Watch(String brand, int isSmart, boolean color) {
        this.brand = brand;
        this.isSmart = isSmart;
        this.color = color;
    }

    @Override
    public String toString() {

        return "Watch [brand=" + brand + ", isSmart=" + isSmart + ", color=" + color + "]";
    }
    @Override
    public int hashCode() {
        return 870;
    }

}

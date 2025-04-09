package com.xworkz.tostring.inner;

public class Watch {
    private String brand;
    private boolean isSmart;
    private String color;

    public Watch(String brand, boolean isSmart, String color) {
        this.brand = brand;
        this.isSmart = isSmart;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Watch [brand=" + brand + ", isSmart=" + isSmart + ", color=" + color + "]";
    }

}

package com.xworkz.tostring.inner;

public class Watch {
    private String brand;
<<<<<<< HEAD
    private int isSmart;
    private boolean color;

    public Watch(String brand, int isSmart, boolean color) {
=======
    private boolean isSmart;
    private String color;

    public Watch(String brand, boolean isSmart, String color) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.brand = brand;
        this.isSmart = isSmart;
        this.color = color;
    }

    @Override
    public String toString() {
<<<<<<< HEAD

        return "Watch [brand=" + brand + ", isSmart=" + isSmart + ", color=" + color + "]";
    }
    @Override
    public int hashCode() {
        return 870;
    }
=======
        return "Watch [brand=" + brand + ", isSmart=" + isSmart + ", color=" + color + "]";
    }
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26

}

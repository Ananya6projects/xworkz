package com.xworkz.tostring.inner;

public class Car {
    private String model;
    private int year;
    private boolean isElectric;

    public Car(String model, int year,boolean isElectric) {
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + ", isElectric=" + isElectric + "]";
    }
    @Override
    public int hashCode() {
        return 60;
    }
}

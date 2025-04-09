package com.xworkz.tostring.inner;

public class Car {
    private String model;
    private String year;
    private double isElectric;

    public Car(String model, String year,double isElectric) {
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + ", isElectric=" + isElectric + "]";
    }
}

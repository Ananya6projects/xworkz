package com.xworkz.tostring.inner;

public class Car {
    private String model;
<<<<<<< HEAD
    private int year;
    private boolean isElectric;

    public Car(String model, int year,boolean isElectric) {
=======
    private String year;
    private double isElectric;

    public Car(String model, String year,double isElectric) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.model = model;
        this.year = year;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + ", isElectric=" + isElectric + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 60;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

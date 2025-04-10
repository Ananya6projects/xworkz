package com.xworkz.tostring.inner;

public class Mobile {
    private String brand;
    private int storage;
    private boolean is5G;

    public Mobile(String brand, int storage, boolean is5G) {
        this.brand = brand;
        this.storage = storage;
        this.is5G = is5G;
    }

    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", storage=" + storage + "GB, is5G=" + is5G + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 290;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

package com.xworkz.tostring.inner;

public class Clipboard {
    private String material;
<<<<<<< HEAD
    private int size;
    private boolean hasStorage;

    public Clipboard(String material, int size, boolean hasStorage) {
=======
    private String size;
    private boolean hasStorage;

    public Clipboard(String material, String size, boolean hasStorage) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.material = material;
        this.size = size;
        this.hasStorage = hasStorage;
    }

    @Override
    public String toString() {
        return "Clipboard [material=" + material + ", size=" + size + ", hasStorage=" + hasStorage + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 61;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

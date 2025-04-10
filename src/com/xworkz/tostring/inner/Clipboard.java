package com.xworkz.tostring.inner;

public class Clipboard {
    private String material;
    private int size;
    private boolean hasStorage;

    public Clipboard(String material, int size, boolean hasStorage) {
        this.material = material;
        this.size = size;
        this.hasStorage = hasStorage;
    }

    @Override
    public String toString() {
        return "Clipboard [material=" + material + ", size=" + size + ", hasStorage=" + hasStorage + "]";
    }
    @Override
    public int hashCode() {
        return 61;
    }
}

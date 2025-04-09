package com.xworkz.tostring.inner;

public class Clipboard {
    private String material;
    private String size;
    private boolean hasStorage;

    public Clipboard(String material, String size, boolean hasStorage) {
        this.material = material;
        this.size = size;
        this.hasStorage = hasStorage;
    }

    @Override
    public String toString() {
        return "Clipboard [material=" + material + ", size=" + size + ", hasStorage=" + hasStorage + "]";
    }
}

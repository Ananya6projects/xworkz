package com.xworkz.tostring.inner;

public class Whiteboard {
    private String size;
    private int frameMaterial;
    private boolean isMagnetic;

    public Whiteboard(String size, int frameMaterial, boolean isMagnetic) {
        this.size = size;
        this.frameMaterial = frameMaterial;
        this.isMagnetic = isMagnetic;
    }

    @Override
    public String toString() {
        return "Whiteboard [size=" + size + ", frameMaterial=" + frameMaterial + ", isMagnetic=" + isMagnetic + "]";
    }
    @Override
    public int hashCode() {
        return 12345;
    }
}

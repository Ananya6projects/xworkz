package com.xworkz.tostring.inner;

public class Whiteboard {
    private String size;
    private String frameMaterial;
    private boolean isMagnetic;

    public Whiteboard(String size, String frameMaterial, boolean isMagnetic) {
        this.size = size;
        this.frameMaterial = frameMaterial;
        this.isMagnetic = isMagnetic;
    }

    @Override
    public String toString() {
        return "Whiteboard [size=" + size + ", frameMaterial=" + frameMaterial + ", isMagnetic=" + isMagnetic + "]";
    }
}

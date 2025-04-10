package com.xworkz.tostring.inner;

public class Whiteboard {
    private String size;
<<<<<<< HEAD
    private int frameMaterial;
    private boolean isMagnetic;

    public Whiteboard(String size, int frameMaterial, boolean isMagnetic) {
=======
    private String frameMaterial;
    private boolean isMagnetic;

    public Whiteboard(String size, String frameMaterial, boolean isMagnetic) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.size = size;
        this.frameMaterial = frameMaterial;
        this.isMagnetic = isMagnetic;
    }

    @Override
    public String toString() {
        return "Whiteboard [size=" + size + ", frameMaterial=" + frameMaterial + ", isMagnetic=" + isMagnetic + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 12345;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

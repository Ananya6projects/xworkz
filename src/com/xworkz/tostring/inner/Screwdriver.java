package com.xworkz.tostring.inner;

public class Screwdriver {
    private String headType;
    private int length;
    private boolean insulatedHandle;

    public Screwdriver(String headType, int length, boolean insulatedHandle) {
        this.headType = headType;
        this.length = length;
        this.insulatedHandle = insulatedHandle;
    }

    @Override
    public String toString() {
        return "Screwdriver [headType=" + headType + ", length=" + length + ", insulatedHandle=" + insulatedHandle + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 9;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

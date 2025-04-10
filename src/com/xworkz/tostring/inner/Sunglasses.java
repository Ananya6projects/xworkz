package com.xworkz.tostring.inner;

public class Sunglasses {
    private String frameColor;
    private int uvProtection;
    private boolean polarized;

    public Sunglasses(String frameColor, int uvProtection, boolean polarized) {
        this.frameColor = frameColor;
        this.uvProtection = uvProtection;
        this.polarized = polarized;
    }

    @Override
    public String toString() {
        return "Sunglasses [frameColor=" + frameColor + ", uvProtection=" + uvProtection + ", polarized=" + polarized + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 230;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

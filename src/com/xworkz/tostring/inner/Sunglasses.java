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
}

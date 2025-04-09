package com.xworkz.tostring.inner;

public class MousePad {
    private String material;
    private int thickness;
    private boolean hasWristRest;

    public MousePad(String material, int thickness, boolean hasWristRest) {
        this.material = material;
        this.thickness = thickness;
        this.hasWristRest = hasWristRest;
    }

    @Override
    public String toString() {
        return "MousePad [material=" + material + ", thickness=" + thickness + ", hasWristRest=" + hasWristRest + "]";
    }
}

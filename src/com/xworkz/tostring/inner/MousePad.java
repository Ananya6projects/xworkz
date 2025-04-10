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
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 940;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

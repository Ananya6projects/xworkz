package com.xworkz.tostring.inner;

public class DrawingTablet {
    private String model;
    private int pressureLevels;
    private boolean wireless;

    public DrawingTablet(String model, int pressureLevels, boolean wireless) {
        this.model = model;
        this.pressureLevels = pressureLevels;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "DrawingTablet [model=" + model + ", pressureLevels=" + pressureLevels + ", wireless=" + wireless + "]";
    }
}

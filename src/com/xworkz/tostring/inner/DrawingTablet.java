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
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 69;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

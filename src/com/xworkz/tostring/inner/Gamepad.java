package com.xworkz.tostring.inner;

public class Gamepad {
    private String color;
    private int buttons;
    private boolean wireless;

    public Gamepad(String color, int buttons, boolean wireless) {
        this.color = color;
        this.buttons = buttons;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Gamepad [color=" + color + ", buttons=" + buttons + ", wireless=" + wireless + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 83;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

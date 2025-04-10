package com.xworkz.tostring.inner;

public class LunchBox {
    private String color;
    private int containerCount;
    private boolean microwaveSafe;

    public LunchBox(String color, int containerCount, boolean microwaveSafe) {
        this.color = color;
        this.containerCount = containerCount;
        this.microwaveSafe = microwaveSafe;
    }

    @Override
    public String toString() {
        return "LunchBox [color=" + color + ", containerCount=" + containerCount + ", microwaveSafe=" + microwaveSafe + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 900;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

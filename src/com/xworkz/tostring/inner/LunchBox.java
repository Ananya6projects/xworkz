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
    @Override
    public int hashCode() {
        return 900;
    }
}

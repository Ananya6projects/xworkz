package com.xworkz.tostring.inner;

public class Highlighter {
    private String color;
    private int tipShape;
    private boolean waterproof;

    public Highlighter(String color, int tipShape, boolean waterproof) {
        this.color = color;
        this.tipShape = tipShape;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Highlighter [color=" + color + ", tipShape=" + tipShape + ", waterproof=" + waterproof + "]";
    }
}

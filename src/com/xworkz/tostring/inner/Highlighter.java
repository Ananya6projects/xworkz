package com.xworkz.tostring.inner;

public class Highlighter {
    private String color;
<<<<<<< HEAD
    private int tipShape;
    private boolean waterproof;

    public Highlighter(String color, int tipShape, boolean waterproof) {
=======
    private String tipShape;
    private boolean waterproof;

    public Highlighter(String color, String tipShape, boolean waterproof) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.color = color;
        this.tipShape = tipShape;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Highlighter [color=" + color + ", tipShape=" + tipShape + ", waterproof=" + waterproof + "]";
    }
}

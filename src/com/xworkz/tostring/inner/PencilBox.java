package com.xworkz.tostring.inner;

public class PencilBox {
    private String shape;
    private int capacity;
    private boolean magnetic;

    public PencilBox(String shape, int capacity, boolean magnetic) {
        this.shape = shape;
        this.capacity = capacity;
        this.magnetic = magnetic;
    }

    @Override
    public String toString() {
        return "PencilBox [shape=" + shape + ", capacity=" + capacity + ", magnetic=" + magnetic + "]";
    }
}

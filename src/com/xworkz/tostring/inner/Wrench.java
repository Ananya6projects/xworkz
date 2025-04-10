package com.xworkz.tostring.inner;

public class Wrench {
    private String type;
    private int size;
    private boolean adjustable;

    public Wrench(String type, int size, boolean adjustable) {
        this.type = type;
        this.size = size;
        this.adjustable = adjustable;
    }

    @Override
    public String toString() {

        return "Wrench [type=" + type + ", size=" + size + ", adjustable=" + adjustable + "]";
    }
    @Override
    public int hashCode() {
        return 2025;
    }
}

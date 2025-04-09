package com.xworkz.tostring.inner;

public class FlashDrive {
    private String brand;
    private int capacity;
    private boolean usb3;

    public FlashDrive(String brand, int capacity, boolean usb3) {
        this.brand = brand;
        this.capacity = capacity;
        this.usb3 = usb3;
    }

    @Override
    public String toString() {
        return "FlashDrive [brand=" + brand + ", capacity=" + capacity + ", usb3=" + usb3 + "]";
    }
}

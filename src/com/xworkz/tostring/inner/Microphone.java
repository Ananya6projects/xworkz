package com.xworkz.tostring.inner;

public class Microphone {
    private String brand;
    private int sensitivity;
    private boolean noiseCancellation;

    public Microphone(String brand, int sensitivity, boolean noiseCancellation) {
        this.brand = brand;
        this.sensitivity = sensitivity;
        this.noiseCancellation = noiseCancellation;
    }

    @Override
    public String toString() {
        return "Microphone [brand=" + brand + ", sensitivity=" + sensitivity + ", noiseCancellation=" + noiseCancellation + "]";
    }
    @Override
    public int hashCode() {
        return 920;
    }
}

package com.xworkz.tostring.inner;

public class SelfieStick {
    private String length;
    private int maxLoad;
    private boolean bluetoothEnabled;

    public SelfieStick(String length, int maxLoad, boolean bluetoothEnabled) {
        this.length = length;
        this.maxLoad = maxLoad;
        this.bluetoothEnabled = bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "SelfieStick [length=" + length + ", maxLoad=" + maxLoad + ", bluetoothEnabled=" + bluetoothEnabled + "]";
    }
}

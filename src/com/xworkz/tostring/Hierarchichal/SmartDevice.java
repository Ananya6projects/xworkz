package com.xworkz.tostring.Hierarchichal;

public class SmartDevice {
    void powerOn() {
        System.out.println("SmartDevice powered on");
    }
}

class EReader extends SmartDevice {
    void readBooks() {
        System.out.println("EReader displaying books");
    }
}

class SmartGlasses extends SmartDevice {
    void displayOverlay() {
        System.out.println("SmartGlasses displaying overlay");
    }
}

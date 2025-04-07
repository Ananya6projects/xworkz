package com.xworkz.inheritances1.internal;

public class DeviceTester {
    public void test(Device device) {
        System.out.println("Checking the device type...");
        device.turnOn();
        device.operate();
        device.connect();
        device.performTask();
        device.shutDown();

        if (device instanceof Smartphone) {
            System.out.println("Device is a Smartphone -- casting and invoking extra methods");
            Smartphone phone = (Smartphone) device;
            phone.takePhoto();
        }
    }
}

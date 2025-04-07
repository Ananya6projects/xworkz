package com.xworkz.inheritances1.internal;

public class DeviceeTester {
    public void test(SmartDevice device) {
        System.out.println("Testing smart device...");
        device.turnOn();
        device.operate();
        device.connect();
        device.performTask();
        device.shutDown();

        if (device instanceof SmartWatch) {
            System.out.println("Device is a SmartWatch -- casting and invoking specific method");
            SmartWatch watch = (SmartWatch) device;
            watch.showNotification();
        }
    }
}

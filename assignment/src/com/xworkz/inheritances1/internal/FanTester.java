package com.xworkz.inheritances1.internal;

public class FanTester {
    public void test(Fan fan) {
        System.out.println("Testing fan...");
        fan.turnOn();
        fan.operate();
        fan.connect();
        fan.performTask();
        fan.shutDown();

        if (fan instanceof CeilingFan) {
            System.out.println("Fan is a CeilingFan -- casting and invoking specific method");
            CeilingFan cf = (CeilingFan) fan;
            cf.changeSpeed();
        }
    }
}

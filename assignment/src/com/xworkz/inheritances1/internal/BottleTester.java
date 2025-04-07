package com.xworkz.inheritances1.internal;

public class BottleTester {
    public void test(Bottle bottle) {
        System.out.println("Testing bottle...");
        bottle.turnOn();
        bottle.operate();
        bottle.connect();
        bottle.performTask();
        bottle.shutDown();

        if (bottle instanceof WaterBottle) {
            System.out.println("Bottle is a WaterBottle -- casting and invoking specific method");
            WaterBottle wb = (WaterBottle) bottle;
            wb.refill();
        }
    }
}

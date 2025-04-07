package com.xworkz.inheritances1.internal;

public class ApplianceTester {
    public void test(KitchenAppliance appliance) {
        System.out.println("Testing kitchen appliance...");
        appliance.turnOn();
        appliance.operate();
        appliance.connect();
        appliance.performTask();
        appliance.shutDown();

        if (appliance instanceof Blender) {
            System.out.println("Appliance is a Blender -- casting and invoking specific method");
            Blender blender = (Blender) appliance;
            blender.pulseMode(); // unique method
        }
    }
}

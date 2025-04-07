package com.xworkz.inheritances1.internal;

public class VehicleTester {
    public void test(TransportVehicle vehicle) {
        System.out.println("Testing transport vehicle...");
        vehicle.turnOn();
        vehicle.operate();
        vehicle.connect();
        vehicle.performTask();
        vehicle.shutDown();

        if (vehicle instanceof ElectricScooter) {
            System.out.println("Vehicle is an ElectricScooter -- casting and invoking specific method");
            ElectricScooter scooter = (ElectricScooter) vehicle;
            scooter.activateEcoMode();
        }
    }
}

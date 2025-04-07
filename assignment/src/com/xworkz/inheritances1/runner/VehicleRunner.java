package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.TransportVehicle;
import com.xworkz.inheritances1.internal.ElectricScooter;
import com.xworkz.inheritances1.internal.VehicleTester;

public class VehicleRunner {
    public static void main(String[] args) {
        TransportVehicle vehicle1 = new TransportVehicle();
        vehicle1.turnOn();
        vehicle1.operate();
        vehicle1.connect();
        vehicle1.performTask();
        vehicle1.shutDown();

        System.out.println("-----------");

        TransportVehicle vehicle2 = new ElectricScooter();
        vehicle2.turnOn();
        vehicle2.operate();
        vehicle2.connect();
        vehicle2.performTask();
        vehicle2.shutDown();

        System.out.println("-----------");

        ElectricScooter scooter = new ElectricScooter();
        scooter.turnOn();
        scooter.operate();
        scooter.connect();
        scooter.performTask();
        scooter.shutDown();

        System.out.println("------casting------");

        VehicleTester tester = new VehicleTester();
        tester.test(vehicle1);
        tester.test(vehicle2);
        tester.test(scooter);
    }
}

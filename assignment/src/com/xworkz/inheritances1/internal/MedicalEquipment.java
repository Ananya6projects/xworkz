package com.xworkz.inheritances1.internal;

public class MedicalEquipment {
    public MedicalEquipment() {
        System.out.println("MedicalEquipment --parent");
    }

    public void turnOn() {
        System.out.println("MedicalEquipment is turning on...");
    }

    public void operate() {
        System.out.println("MedicalEquipment is operating...");
    }

    public void connect() {
        System.out.println("MedicalEquipment is connecting to the hospital system...");
    }

    public void performTask() {
        System.out.println("MedicalEquipment is performing its task...");
    }

    public void shutDown() {
        System.out.println("MedicalEquipment is shutting down...");
    }
}

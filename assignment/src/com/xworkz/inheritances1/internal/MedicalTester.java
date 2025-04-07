package com.xworkz.inheritances1.internal;

public class MedicalTester {
    public void test(MedicalEquipment equipment) {
        System.out.println("Testing medical equipment...");
        equipment.turnOn();
        equipment.operate();
        equipment.connect();
        equipment.performTask();
        equipment.shutDown();

        if (equipment instanceof ECGMachine) {
            System.out.println("Equipment is an ECGMachine -- casting and invoking specific methods");
            ECGMachine ecg = (ECGMachine) equipment;
            ecg.startECG();
            ecg.stopECG();
            ecg.analyzeSignal();
            ecg.printReport();
            ecg.sendToDoctor();
        }
    }
}

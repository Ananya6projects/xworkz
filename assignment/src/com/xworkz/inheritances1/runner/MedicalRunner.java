package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.MedicalEquipment;
import com.xworkz.inheritances1.internal.ECGMachine;
import com.xworkz.inheritances1.internal.MedicalTester;

public class MedicalRunner {
    public static void main(String[] args) {
        MedicalEquipment equipment1 = new MedicalEquipment();
        equipment1.turnOn();
        equipment1.operate();
        equipment1.connect();
        equipment1.performTask();
        equipment1.shutDown();

        System.out.println("-----------");

        MedicalEquipment equipment2 = new ECGMachine();
        equipment2.turnOn();
        equipment2.operate();
        equipment2.connect();
        equipment2.performTask();
        equipment2.shutDown();

        System.out.println("-----------");

        ECGMachine ecg = new ECGMachine();
        ecg.turnOn();
        ecg.operate();
        ecg.connect();
        ecg.performTask();
        ecg.shutDown();

        System.out.println("------casting------");

        MedicalTester tester = new MedicalTester();
        tester.test(equipment1);
        tester.test(equipment2);
        tester.test(ecg);
    }
}

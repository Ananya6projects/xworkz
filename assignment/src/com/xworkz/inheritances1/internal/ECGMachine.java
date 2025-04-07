package com.xworkz.inheritances1.internal;

public class ECGMachine extends MedicalEquipment {
    public ECGMachine() {
        super();
        System.out.println("ECGMachine --child");
    }

    @Override
    public void turnOn() {
        System.out.println("ECGMachine powers on with safety check --child");
    }

    @Override
    public void operate() {
        System.out.println("ECGMachine is recording heart activity --child");
    }

    @Override
    public void connect() {
        System.out.println("ECGMachine connects to patient data system --child");
    }

    @Override
    public void performTask() {
        System.out.println("ECGMachine captures and stores ECG data --child");
    }

    @Override
    public void shutDown() {
        System.out.println("ECGMachine shuts down safely --child");
    }

    public void startECG() {
        System.out.println("ECGMachine starts recording ECG...");
    }

    public void stopECG() {
        System.out.println("ECGMachine stops recording...");
    }

    public void analyzeSignal() {
        System.out.println("ECGMachine analyzes ECG signal...");
    }

    public void printReport() {
        System.out.println("ECGMachine prints the ECG report...");
    }

    public void sendToDoctor() {
        System.out.println("ECGMachine sends report to doctor...");
    }
}

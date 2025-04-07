package com.xworkz.inheritances1.internal;

public class MachineTester {
    public void test(Machine machine) {
        System.out.println("Checking the machine type...");
        machine.turnOn();
        machine.operate();
        machine.connect();
        machine.performTask();
        machine.shutDown();

        if (machine instanceof Tablet) {
            System.out.println("Machine is a Tablet -- casting and invoking extra methods");
            Tablet tab = (Tablet) machine;
            tab.drawWithStylus();
            tab.readEbook();
            tab.joinVideoCall();
            tab.playGames();
            tab.takeScreenshot();
        }
    }
}

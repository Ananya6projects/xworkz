package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.Machine;
import com.xworkz.inheritances1.internal.Tablet;
import com.xworkz.inheritances1.internal.MachineTester;

public class MachineRunner {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.turnOn();
        machine1.operate();
        machine1.connect();
        machine1.performTask();
        machine1.shutDown();

        System.out.println("-----------");

        Machine machine2 = new Tablet();
        machine2.turnOn();
        machine2.operate();
        machine2.connect();
        machine2.performTask();
        machine2.shutDown();

        System.out.println("-----------");

        Tablet tablet = new Tablet();
        tablet.turnOn();
        tablet.operate();
        tablet.connect();
        tablet.performTask();
        tablet.shutDown();

        System.out.println("------casting------");

        MachineTester tester = new MachineTester();
        tester.test(machine1);
        tester.test(machine2);
        tester.test(tablet);
    }
}

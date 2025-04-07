package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.Fan;
import com.xworkz.inheritances1.internal.CeilingFan;
import com.xworkz.inheritances1.internal.FanTester;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.operate();
        fan1.connect();
        fan1.performTask();
        fan1.shutDown();

        System.out.println("-----------");

        Fan fan2 = new CeilingFan();
        fan2.turnOn();
        fan2.operate();
        fan2.connect();
        fan2.performTask();
        fan2.shutDown();

        System.out.println("-----------");

        CeilingFan cf = new CeilingFan();
        cf.turnOn();
        cf.operate();
        cf.connect();
        cf.performTask();
        cf.shutDown();

        System.out.println("------casting------");

        FanTester tester = new FanTester();
        tester.test(fan1);
        tester.test(fan2);
        tester.test(cf);
    }
}

package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.SmartDevice;
import com.xworkz.inheritances1.internal.SmartWatch;
import com.xworkz.inheritances1.internal.DeviceeTester;

public class DeviceRunneer {
    public static void main(String[] args) {
        SmartDevice device1 = new SmartDevice();
        device1.turnOn();
        device1.operate();
        device1.connect();
        device1.performTask();
        device1.shutDown();

        System.out.println("-----------");

        SmartDevice device2 = new SmartWatch();
        device2.turnOn();
        device2.operate();
        device2.connect();
        device2.performTask();
        device2.shutDown();

        System.out.println("-----------");

        SmartWatch watch = new SmartWatch();
        watch.turnOn();
        watch.operate();
        watch.connect();
        watch.performTask();
        watch.shutDown();

        System.out.println("------casting------");

        DeviceeTester tester = new DeviceeTester();
        tester.test(device1);
        tester.test(device2);
        tester.test(watch);
    }
}

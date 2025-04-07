package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.Device;
import com.xworkz.inheritances1.internal.Smartphone;
import com.xworkz.inheritances1.internal.DeviceTester;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.turnOn();
        device.operate();
        device.connect();
        device.performTask();
        device.shutDown();

        System.out.println("-----------");

        Device device2 = new Smartphone();
        device2.turnOn();
        device2.operate();
        device2.connect();
        device2.performTask();
        device2.shutDown();

        System.out.println("-----------");

        Smartphone smartphone = new Smartphone();
        smartphone.turnOn();
        smartphone.operate();
        smartphone.connect();
        smartphone.performTask();
        smartphone.shutDown();

        System.out.println("------casting------");

        DeviceTester tester = new DeviceTester();
        tester.test(device);
        tester.test(device2);
        tester.test(smartphone);
    }
}

package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.Bottle;
import com.xworkz.inheritances1.internal.WaterBottle;
import com.xworkz.inheritances1.internal.BottleTester;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        bottle1.turnOn();
        bottle1.operate();
        bottle1.connect();
        bottle1.performTask();
        bottle1.shutDown();

        System.out.println("-----------");

        Bottle bottle2 = new WaterBottle();
        bottle2.turnOn();
        bottle2.operate();
        bottle2.connect();
        bottle2.performTask();
        bottle2.shutDown();

        System.out.println("-----------");

        WaterBottle wb = new WaterBottle();
        wb.turnOn();
        wb.operate();
        wb.connect();
        wb.performTask();
        wb.shutDown();

        System.out.println("------casting------");

        BottleTester tester = new BottleTester();
        tester.test(bottle1);
        tester.test(bottle2);
        tester.test(wb);
    }
}

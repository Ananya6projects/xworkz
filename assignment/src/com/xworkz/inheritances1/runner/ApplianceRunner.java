package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.KitchenAppliance;
import com.xworkz.inheritances1.internal.Blender;
import com.xworkz.inheritances1.internal.ApplianceTester;

public class ApplianceRunner {
    public static void main(String[] args) {
        KitchenAppliance appliance1 = new KitchenAppliance();
        appliance1.turnOn();
        appliance1.operate();
        appliance1.connect();
        appliance1.performTask();
        appliance1.shutDown();

        System.out.println("-----------");

        KitchenAppliance appliance2 = new Blender();
        appliance2.turnOn();
        appliance2.operate();
        appliance2.connect();
        appliance2.performTask();
        appliance2.shutDown();

        System.out.println("-----------");

        Blender blender = new Blender();
        blender.turnOn();
        blender.operate();
        blender.connect();
        blender.performTask();
        blender.shutDown();

        System.out.println("------casting------");

        ApplianceTester tester = new ApplianceTester();
        tester.test(appliance1);
        tester.test(appliance2);
        tester.test(blender);
    }
}

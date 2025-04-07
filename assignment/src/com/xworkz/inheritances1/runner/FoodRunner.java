package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.FoodItem;
import com.xworkz.inheritances1.internal.Ghee;
import com.xworkz.inheritances1.internal.FoodTester;

public class FoodRunner {
    public static void main(String[] args) {
        FoodItem item1 = new FoodItem();
        item1.turnOn();
        item1.operate();
        item1.connect();
        item1.performTask();
        item1.shutDown();

        System.out.println("-----------");

        FoodItem item2 = new Ghee();
        item2.turnOn();
        item2.operate();
        item2.connect();
        item2.performTask();
        item2.shutDown();

        System.out.println("-----------");

        Ghee ghee = new Ghee();
        ghee.turnOn();
        ghee.operate();
        ghee.connect();
        ghee.performTask();
        ghee.shutDown();

        System.out.println("------casting------");

        FoodTester tester = new FoodTester();
        tester.test(item1);
        tester.test(item2);
        tester.test(ghee);
    }
}

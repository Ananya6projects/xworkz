package com.xworkz.inheritances1.internal;

public class FoodTester {
    public void test(FoodItem item) {
        System.out.println("Testing food item...");
        item.turnOn();
        item.operate();
        item.connect();
        item.performTask();
        item.shutDown();

        if (item instanceof Ghee) {
            System.out.println("Item is Ghee -- casting and invoking specific method");
            Ghee ghee = (Ghee) item;
            ghee.applyToFood();
        }
    }
}

package com.xworkz.inheritances1.internal;

public class FoodItem {
    public FoodItem() {
        System.out.println("FoodItem --parent");
    }

    public void turnOn() {
        System.out.println("FoodItem is getting prepared...");
    }

    public void operate() {
        System.out.println("FoodItem is being processed...");
    }

    public void connect() {
        System.out.println("FoodItem is connecting with recipe module...");
    }

    public void performTask() {
        System.out.println("FoodItem is enhancing flavor...");
    }

    public void shutDown() {
        System.out.println("FoodItem is being stored safely...");
    }
}

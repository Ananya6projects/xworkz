package com.xworkz.inheritances1.internal;

public class Ghee extends FoodItem {
    public Ghee() {
        super();
        System.out.println("Ghee --child");
    }

    @Override
    public void turnOn() {
        System.out.println("Ghee starts melting for use --child");
    }

    @Override
    public void operate() {
        System.out.println("Ghee is used in cooking and Ayurveda --child");
    }

    @Override
    public void connect() {
        System.out.println("Ghee connects with spices in cooking --child");
    }

    @Override
    public void performTask() {
        System.out.println("Ghee enhances aroma and health --child");
    }

    @Override
    public void shutDown() {
        System.out.println("Ghee is cooled and stored in container --child");
    }

    // ✅ Unique method (not overridden)
    public void applyToFood() {
        System.out.println("Ghee is applied over hot rice...");
    }
}

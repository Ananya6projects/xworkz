package com.xworkz.inheritances1.internal;

public class Blender extends KitchenAppliance {
    public Blender() {
        super();
        System.out.println("Blender --child");
    }

    @Override
    public void turnOn() {
        System.out.println("Blender starts spinning blades --child");
    }

    @Override
    public void operate() {
        System.out.println("Blender is blending ingredients --child");
    }

    @Override
    public void connect() {
        System.out.println("Blender connected to kitchen socket --child");
    }

    @Override
    public void performTask() {
        System.out.println("Blender is making smoothies --child");
    }

    @Override
    public void shutDown() {
        System.out.println("Blender powers off with a click --child");
    }

    // ✅ Unique method (not overridden)
    public void pulseMode() {
        System.out.println("Blender activates pulse mode...");
    }
}

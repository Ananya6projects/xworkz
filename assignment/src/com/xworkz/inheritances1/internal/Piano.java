package com.xworkz.inheritances1.internal;

public class Piano extends MusicalInstrument {
    public Piano() {
        super();
        System.out.println("Piano --child");
    }

    @Override
    public void turnOn() {
        System.out.println("Piano powers on with tuning setup --child");
    }

    @Override
    public void operate() {
        System.out.println("Piano is playing melody --child");
    }

    @Override
    public void connect() {
        System.out.println("Piano connects to speaker system --child");
    }

    @Override
    public void performTask() {
        System.out.println("Piano is performing a classical piece --child");
    }

    @Override
    public void shutDown() {
        System.out.println("Piano powers down softly --child");
    }

    // ✅ One unique method (not overridden)
    public void playChord() {
        System.out.println("Piano plays a beautiful chord...");
    }
}

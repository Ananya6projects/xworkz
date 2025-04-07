package com.xworkz.inheritances1.internal;

public class Tablet extends Machine {
    public Tablet() {
        super();
        System.out.println("Tablet --child");
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet powers on with touch --child");
    }

    @Override
    public void operate() {
        System.out.println("Tablet used for reading and streaming --child");
    }

    @Override
    public void connect() {
        System.out.println("Tablet connects to Wi-Fi and Bluetooth --child");
    }

    @Override
    public void performTask() {
        System.out.println("Tablet runs productivity and entertainment apps --child");
    }

    @Override
    public void shutDown() {
        System.out.println("Tablet shutting down gracefully --child");
    }

    public void drawWithStylus() {
        System.out.println("Tablet allows drawing with stylus");
    }

    public void readEbook() {
        System.out.println("Tablet is reading an ebook");
    }

    public void joinVideoCall() {
        System.out.println("Tablet joins a video call");
    }

    public void playGames() {
        System.out.println("Tablet is playing casual games");
    }

    public void takeScreenshot() {
        System.out.println("Tablet takes a screenshot");
    }
}

package com.xworkz.tostring.SingleLevel;

public class LightSource {
    void illuminate() {
        System.out.println("LightSource is illuminating");
    }
    class Lantern extends LightSource {
        void glow() {
            System.out.println("Lantern is glowing");
        }
    }
}

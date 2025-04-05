package com.xworkz.inheritances1;

public class Volcano extends VolcanoParent {
    @Override
    void category() { System.out.println("Overridden: This is a natural volcano."); }
    @Override
    void mostActiveVolcano() { System.out.println("Overridden: Most Active is Kilauea"); }
    @Override
    void highestVolcano() { System.out.println("Overridden: Highest is Ojos del Salado"); }
    @Override
    void eruptionFrequency() { System.out.println("Overridden: Eruption Frequency is every few years"); }
    @Override
    void lavaComposition() { System.out.println("Overridden: Lava Type is Basaltic"); }
}

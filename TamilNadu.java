package com.xworkz.inheritances1;

public class TamilNadu extends TamilNaduParent {
    @Override
    void countryInfo() { System.out.println("Overridden: Tamil Nadu is a state in southern India."); }
    @Override
    void stateAnimal() { System.out.println("Overridden: State Animal is Nilgiri Tahr"); }
    @Override
    void stateBird() { System.out.println("Overridden: State Bird is Emerald Dove"); }
    @Override
    void stateSport() { System.out.println("Overridden: State Sport is Jallikattu"); }
    @Override
    void stateFlower() { System.out.println("Overridden: State Flower is Glory Lily"); }
}

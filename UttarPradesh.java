package com.xworkz.inheritances1;

public class UttarPradesh extends UttarPradeshParent {
    @Override
    void stateAnimal() { System.out.println("Overridden: State Animal is Barasingha"); }
    @Override
    void stateBird() { System.out.println("Overridden: State Bird is Sarus Crane"); }
    @Override
    void stateSport() { System.out.println("Overridden: State Sport is Wrestling"); }
    @Override
    void stateFlower() { System.out.println("Overridden: State Flower is Palash"); }
}
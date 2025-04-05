package com.xworkz.inheritances1;

public class Tripura extends TripuraParent {
    @Override
    void countryInfo() { System.out.println("Overridden: Tripura is a state in northeast India."); }
    @Override
    void stateAnimal() { System.out.println("Overridden: State Animal is Phayre's Langur"); }
    @Override
    void stateBird() { System.out.println("Overridden: State Bird is Green Imperial Pigeon"); }
    @Override
    void stateSport() { System.out.println("Overridden: State Sport is Football"); }
    @Override
    void stateFlower() { System.out.println("Overridden: State Flower is Nageshwar"); }
}

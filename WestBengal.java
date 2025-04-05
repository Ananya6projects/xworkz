package com.xworkz.inheritances1;

public class WestBengal extends WestBengalParent {
    @Override
    void countryInfo() { System.out.println("Overridden: West Bengal is a state in eastern India."); }
    @Override
    void stateAnimal() { System.out.println("Overridden: State Animal is Fishing Cat"); }
    @Override
    void stateBird() { System.out.println("Overridden: State Bird is White-throated Kingfisher"); }
    @Override
    void stateSport() { System.out.println("Overridden: State Sport is Football"); }
    @Override
    void stateFlower() { System.out.println("Overridden: State Flower is Night-flowering Jasmine"); }
}
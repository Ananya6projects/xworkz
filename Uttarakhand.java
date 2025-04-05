package com.xworkz.inheritances1;

public class Uttarakhand extends UttarakhandParent {
    @Override
    void countryInfo() { System.out.println("Overridden: Uttarakhand is a Himalayan state in India."); }
    @Override
    void stateAnimal() { System.out.println("Overridden: State Animal is Alpine Musk Deer"); }
    @Override
    void stateBird() { System.out.println("Overridden: State Bird is Himalayan Monal"); }
    @Override
    void stateSport() { System.out.println("Overridden: State Sport is Football"); }
    @Override
    void stateFlower() { System.out.println("Overridden: State Flower is Brahma Kamal"); }
}
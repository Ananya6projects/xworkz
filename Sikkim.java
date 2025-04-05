package com.xworkz.inheritances1;

public class Sikkim extends SikkimParent {
    @Override
    void countryInfo() { System.out.println("SikkimChild: Northeastern state of India"); }

    @Override
    void stateAnimal() { System.out.println("SikkimChild: State animal is Red Panda"); }

    @Override
    void stateBird() { System.out.println("SikkimChild: Bird is Blood Pheasant"); }

    @Override
    void stateSport() { System.out.println("SikkimChild: Football is popular"); }

    @Override
    void stateFlower() { System.out.println("SikkimChild: Flower is Dendrobium Nobile"); }
}

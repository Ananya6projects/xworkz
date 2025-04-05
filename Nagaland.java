package com.xworkz.inheritances1;

public class Nagaland extends NagalandParent {

    @Override
    void countryInfo() {
        System.out.println("Nagaland lies in the northeastern region of India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Nagaland's state animal is the Mithun, a semi-domesticated bovine.");
    }

    @Override
    void stateBird() {
        System.out.println("Nagaland's state bird is Blyth’s Tragopan, a rare pheasant species.");
    }

    @Override
    void stateSport() {
        System.out.println("Traditional Wrestling is a popular sport in Nagaland.");
    }

    @Override
    void stateFlower() {
        System.out.println("Nagaland's state flower is the Rhododendron, symbolizing beauty and strength.");
    }
}

package com.xworkz.inheritances1;

public class Jharkhand extends JharkhandParent {

    @Override
    void countryInfo() {
        System.out.println("Jharkhand is a mineral-rich state in eastern India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Elephant");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Asian Koel");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Hockey");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Palash");
    }
}

package com.xworkz.inheritances1;

public class Chandigarh extends ChandigarhParent {

    @Override
    void countryInfo() {
        System.out.println("Chandigarh is a beautifully planned city and Union Territory of India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Indian Palm Squirrel");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Common Myna");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Hockey");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Bougainvillea");
    }
}

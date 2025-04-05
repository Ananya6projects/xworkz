package com.xworkz.inheritances1;

public class Banaras extends BanarasParent {

    @Override
    void countryInfo() {
        System.out.println("Banaras is a historic city in Uttar Pradesh, India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Elephant (symbol of wisdom and power)");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Peacock");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Wrestling and Cricket are popular");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Lotus");
    }

}

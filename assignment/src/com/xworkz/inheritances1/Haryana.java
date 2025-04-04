package com.xworkz.inheritances1;

public class Haryana extends HaryanaParent {

    @Override
    void countryInfo() {
        System.out.println("Country Info: Haryana is a North Indian state known for agriculture and wrestling.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Blackbuck – A graceful and endangered antelope.");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Black Francolin – Known for its loud call and vibrant plumage.");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Wrestling – Haryana has produced many Olympic wrestlers.");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Lotus – Symbol of purity and strength.");
    }
}

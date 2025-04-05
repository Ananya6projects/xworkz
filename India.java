package com.xworkz.inheritances1;

public class India extends IndiaParent {

    @Override
    void countryInfo() {
        System.out.println("India is a diverse country in South Asia.");
    }

    @Override
    void stateAnimal() {
        System.out.println("National Animal: Tiger");
    }

    @Override
    void stateBird() {
        System.out.println("National Bird: Peacock");
    }

    @Override
    void stateSport() {
        System.out.println("National Sport: Water Sports");
    }

    @Override
    void stateFlower() {
        System.out.println("National Flower: Lotus");
    }
}

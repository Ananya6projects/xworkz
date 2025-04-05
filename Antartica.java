package com.xworkz.inheritances1;

public class Antartica extends AntarticaParent {

    @Override
    void countryInfo() {
        System.out.println("Antartica: Earth's southernmost continent, mostly covered in ice.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Continent Animal: Emperor Penguin");
    }

    @Override
    void stateBird() {
        System.out.println("Continent Bird: Snow Petrel");
    }

    @Override
    void stateSport() {
        System.out.println("Continent Sport: Ice Skating");
    }

    @Override
    void stateFlower() {
        System.out.println("Continent Flower: Antarctic Hair Grass (only two native flowering plants)");
    }
}

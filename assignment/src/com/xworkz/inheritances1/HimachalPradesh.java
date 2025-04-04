package com.xworkz.inheritances1;

public class HimachalPradesh extends HimachalPradeshParent {

    @Override
    void countryInfo() {
        System.out.println("Himachal Pradesh is a beautiful hill state in India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Snow Leopard");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Western Tragopan");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Cricket");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Pink Rhododendron");
    }
}

package com.xworkz.inheritances1;

public class Hassan extends HassanParent {

    @Override
    void countryInfo() {
        System.out.println("Country Info: Hassan is a district located in the Indian state of Karnataka.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: One-horned Rhinoceros – Known for its unique single horn.");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: White-winged Duck – A rare and endangered species.");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Football – Widely played and followed across the district.");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Fox Tail Orchid – A beautiful and delicate flower.");
    }
}

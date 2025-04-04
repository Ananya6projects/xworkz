package com.xworkz.inheritances1;

public class Karnataka extends KarnatakaParent {

    @Override
    void countryInfo() {
        System.out.println("Karnataka is a state in South India known for tech and temples.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Indian Elephant");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Indian Roller");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Kambala - Buffalo Race");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Lotus");
    }
}

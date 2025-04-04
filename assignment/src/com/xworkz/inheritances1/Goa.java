package com.xworkz.inheritances1;

public class Goa extends GoaParent {

    @Override
    void countryInfo() {
        System.out.println("Country Info: Goa is a coastal state in western India, known for beaches and tourism.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Gaur – also known as the Indian bison, found in forested areas.");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Flame-throated Bulbul – a vibrant bird native to the Western Ghats.");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Football – the most popular and passionately followed sport in Goa.");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Jasmine – a fragrant flower symbolizing beauty and purity.");
    }
}

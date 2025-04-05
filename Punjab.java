package com.xworkz.inheritances1;

public class Punjab extends PunjabParent {
    @Override
    void countryInfo() { System.out.println("Child: Northwestern Indian state."); }
    @Override
    void stateAnimal() { System.out.println("Child: Blackbuck - elegant grazer"); }
    @Override
    void stateBird() { System.out.println("Child: Northern Goshawk - skilled hunter"); }
    @Override
    void stateSport() { System.out.println("Child: Kabaddi - traditional sport"); }
    @Override
    void stateFlower() { System.out.println("Child: Gladiolus - vibrant blooms"); }
}

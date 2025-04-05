package com.xworkz.inheritances1;

public class Rajasthan extends RajasthanParent {
    @Override
    void countryInfo() { System.out.println("Child: Desert state of India."); }
    @Override
    void stateAnimal() { System.out.println("Child: Camel - ship of the desert"); }
    @Override
    void stateBird() { System.out.println("Child: Great Indian Bustard - endangered"); }
    @Override
    void stateSport() { System.out.println("Child: Basketball and Polo"); }
    @Override
    void stateFlower() { System.out.println("Child: Rohida - desert bloom"); }
}

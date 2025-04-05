package com.xworkz.inheritances1;

public class Telangana extends TelanganaParent {
    @Override
    void countryInfo() { System.out.println("Overridden: Telangana is a newly formed state in India."); }
    @Override
    void stateAnimal() { System.out.println("Overridden: State Animal is Spotted Deer"); }
    @Override
    void stateBird() { System.out.println("Overridden: State Bird is Indian Roller"); }
    @Override
    void stateSport() { System.out.println("Overridden: State Sport is Kabaddi"); }
    @Override
    void stateFlower() { System.out.println("Overridden: State Flower is Tangedu"); }
}
package com.xworkz.inheritances1;

public class Chhattisgarh extends ChhattisgarhParent {

    @Override
    void countryInfo() {
        System.out.println("Chhattisgarh is located in central India and known for its forests and waterfalls.");
    }

    @Override
    void stateAnimal() {
        System.out.println("State Animal: Indian Wild Buffalo – also known as Arna.");
    }

    @Override
    void stateBird() {
        System.out.println("State Bird: Hill Myna – famous for mimicking human speech.");
    }

    @Override
    void stateSport() {
        System.out.println("State Sport: Kabaddi – widely played in rural areas.");
    }

    @Override
    void stateFlower() {
        System.out.println("State Flower: Sal Tree Flower – native to the region’s dense forests.");
    }
}

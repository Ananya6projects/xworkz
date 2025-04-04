package com.xworkz.inheritances1;

public class Galaxy extends GalaxyParent {

    @Override
    void category() {
        System.out.println("Category: Galaxies are massive collections of stars, planets, gas, and dark matter.");
    }

    @Override
    void largestGalaxy() {
        System.out.println("Largest Galaxy: IC 1101, roughly 6 million light-years in diameter.");
    }

    @Override
    void galaxyTypes() {
        System.out.println("Types: Spiral (e.g., Milky Way), Elliptical, Irregular, and Lenticular.");
    }

    @Override
    void galaxyFormation() {
        System.out.println("Formation: Formed from large clouds of gas and dust collapsing under gravity.");
    }

    @Override
    void galaxyImportance() {
        System.out.println("Importance: Galaxies are essential structures for the birth and evolution of stars and planetary systems.");
    }
}

package com.xworkz.inheritances1;

public class Island extends IslandParent {

    @Override
    void category() {
        System.out.println("Island is a land surrounded by water.");
    }

    @Override
    void largestIsland() {
        System.out.println("Largest Island: Greenland");
    }

    @Override
    void mostPopulatedIsland() {
        System.out.println("Most Populated Island: Java");
    }

    @Override
    void islandClimate() {
        System.out.println("Island Climate: Tropical and Temperate Zones");
    }

    @Override
    void famousIsland() {
        System.out.println("Famous Island: Maldives");
    }
}

package com.xworkz.inheritances1;

public class Desert extends DesertParent {

    @Override
    void category() {
        System.out.println("Category: Arid Region with Extreme Climate and Sparse Vegetation");
    }

    @Override
    void largestDesert() {
        System.out.println("Largest Desert: Antarctica – cold desert with very low precipitation");
    }

    @Override
    void hottestDesert() {
        System.out.println("Hottest Desert: Sahara – spans across North Africa");
    }

    @Override
    void averageRainfall() {
        System.out.println("Average Rainfall: Typically less than 250mm annually");
    }

    @Override
    void desertFlora() {
        System.out.println("Common Flora: Cactus, Date Palm, and Desert Marigold");
    }
}

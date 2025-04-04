package com.xworkz.inheritances1;

public class FaceWash extends FaceWashParent {

    @Override
    void category() {
        System.out.println("Category: Face wash is a daily-use skincare cleanser.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Key Ingredient: Contains Salicylic Acid, Charcoal, and Tea Tree Oil.");
    }

    @Override
    void benefits() {
        System.out.println("Benefits: Removes dirt, unclogs pores, and prevents breakouts.");
    }

    @Override
    void usage() {
        System.out.println("Usage: Apply to wet face, gently massage, and rinse off. Use morning and night.");
    }

    @Override
    void brands() {
        System.out.println("Popular Brands: Clean & Clear, Mamaearth, Ponds, Nivea, and Himalaya.");
    }
}

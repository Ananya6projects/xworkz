package com.xworkz.inheritances1;

public class Deodorant extends DeodorantParent {

    @Override
    void category() {
        System.out.println("Category: Fragrance-based Personal Care Product to Combat Body Odor");
    }

    @Override
    void keyIngredient() {
        System.out.println("Key Ingredient: Aluminum Chloride and Antibacterial Agents");
    }

    @Override
    void benefits() {
        System.out.println("Benefits: Controls Sweat, Neutralizes Odor, and Keeps You Fresh");
    }

    @Override
    void usage() {
        System.out.println("Usage: Apply Directly to Underarms After Bathing for Best Results");
    }

    @Override
    void brands() {
        System.out.println("Popular Brands: Nivea, Dove, Brut, Park Avenue, and Wild Stone");
    }
}

package com.xworkz.inheritances1;

public class HairGel extends HairGelParent {

    @Override
    void category() {
        System.out.println("Category: Hair gel is a cosmetic product used for styling and holding hair in place.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Key Ingredient: Includes Aloe Vera for moisture and Vitamin B5 for hair health.");
    }

    @Override
    void benefits() {
        System.out.println("Benefits: Adds long-lasting hold, shine, and helps manage frizz.");
    }

    @Override
    void usage() {
        System.out.println("Usage: Take a small amount, apply evenly on damp or dry hair, and style as desired.");
    }

    @Override
    void brands() {
        System.out.println("Popular Brands: Gatsby, L'Oréal, Schwarzkopf, Set Wet, and Brylcreem.");
    }
}

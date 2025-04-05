package com.xworkz.inheritances1;

public class Toothpaste extends ToothpasteParent {
    @Override
    void category() { System.out.println("Overridden: This is a toothpaste product."); }
    @Override
    void keyIngredient() { System.out.println("Overridden: Key Ingredient is Fluoride"); }
    @Override
    void benefits() { System.out.println("Overridden: Benefits include cavity prevention and enamel strengthening"); }
    @Override
    void usage() { System.out.println("Overridden: Use twice daily"); }
    @Override
    void brands() { System.out.println("Overridden: Popular brands include Colgate, Sensodyne, Pepsodent"); }
}

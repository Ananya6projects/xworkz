package com.xworkz.inheritances1;

public class Soap extends SoapParent {
    @Override
    void category() { System.out.println("SoapChild: Hygiene Essentials"); }

    @Override
    void keyIngredient() { System.out.println("SoapChild: Neem & Glycerin"); }

    @Override
    void benefits() { System.out.println("SoapChild: Cleanses and moisturizes"); }

    @Override
    void usage() { System.out.println("SoapChild: Use daily for best results"); }

    @Override
    void brands() { System.out.println("SoapChild: Dove, Lifebuoy, Medimix"); }
}

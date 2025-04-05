package com.xworkz.inheritances1;

public class Perfume extends PerfumeParent {
    @Override
    void category() { System.out.println("Child: Luxury fragrance item"); }
    @Override
    void keyIngredient() { System.out.println("Child: Rose, Jasmine & Amber"); }
    @Override
    void benefits() { System.out.println("Child: Boosts mood and charm"); }
    @Override
    void usage() { System.out.println("Child: Behind ears and wrists"); }
    @Override
    void brands() { System.out.println("Child: Dior Sauvage, Tom Ford"); }
}

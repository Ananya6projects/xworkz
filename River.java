package com.xworkz.inheritances1;

public class River extends RiverParent {
    @Override
    void category() { System.out.println("Child: Flowing freshwater system"); }
    @Override
    void longestRiver() { System.out.println("Child: Nile in Africa"); }
    @Override
    void deepestRiver() { System.out.println("Child: Congo - 220m deep"); }
    @Override
    void riverSource() { System.out.println("Child: Source varies with tributaries"); }
    @Override
    void riverMouth() { System.out.println("Child: Mouth to seas or oceans"); }
}

package com.xworkz.inheritances1;

public class Nebula extends NebulaParent {
    @Override
    void category() { System.out.println("Child: Cosmic cloud forming stars."); }
    @Override
    void famousNebula() { System.out.println("Child: Crab Nebula"); }
    @Override
    void nebulaTypes() { System.out.println("Child: Reflection and Planetary types"); }
    @Override
    void nebulaFormation() { System.out.println("Child: Supernova remnants"); }
    @Override
    void nebulaImportance() { System.out.println("Child: Crucial for star birth"); }
}

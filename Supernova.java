package com.xworkz.inheritances1;

public class Supernova extends SupernovaParent {
    @Override
    void category() { System.out.println("SupernovaChild: Final explosion of a star"); }

    @Override
    void typesOfSupernovae() { System.out.println("SupernovaChild: Includes Type I and II"); }

    @Override
    void supernovaBrightness() { System.out.println("SupernovaChild: Extremely bright events"); }

    @Override
    void supernovaFormation() { System.out.println("SupernovaChild: Caused by core collapse"); }

    @Override
    void elementsFromSupernova() { System.out.println("SupernovaChild: Produces heavy elements"); }
}

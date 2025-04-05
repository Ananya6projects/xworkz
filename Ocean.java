package com.xworkz.inheritances1;

public class Ocean extends OceanParent {
    @Override
    void category() { System.out.println("Child: Vast saltwater body"); }
    @Override
    void largestOcean() { System.out.println("Child: Pacific"); }
    @Override
    void averageDepth() { System.out.println("Child: 3,800 meters"); }
    @Override
    void salinity() { System.out.println("Child: 3.4% avg"); }
    @Override
    void famousTrench() { System.out.println("Child: Mariana Trench - deepest point"); }
}

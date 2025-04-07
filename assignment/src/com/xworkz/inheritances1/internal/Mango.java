package com.xworkz.inheritances1.internal;

public class Mango extends Fruit {
    public Mango() {
        super();
        System.out.println("Mango -- child");
    }

    @Override
    public void grow() {
        System.out.println("Mango is growing during summer -- child");
    }

    @Override
    public void ripen() {
        System.out.println("Mango ripens to a golden color -- child");
    }

    @Override
    public void harvest() {
        System.out.println("Mango is carefully harvested by hand -- child");
    }

    @Override
    public void sell() {
        System.out.println("Mango is sold in fruit stalls -- child");
    }

    @Override
    public void eat() {
        System.out.println("Mango is juicy and sweet when eaten -- child");
    }

    public void makeJuice() {
        System.out.println("Mango is turned into delicious juice");
    }
}

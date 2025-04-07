package com.xworkz.inheritances1.internal;

public class Fruit {
    public Fruit() {
        System.out.println("Fruit -- parent");
    }

    public void grow() {
        System.out.println("Fruit is growing on the tree...");
    }

    public void ripen() {
        System.out.println("Fruit is ripening under the sun...");
    }

    public void harvest() {
        System.out.println("Fruit is being harvested...");
    }

    public void sell() {
        System.out.println("Fruit is sold in the market...");
    }

    public void eat() {
        System.out.println("Fruit is being eaten...");
    }
}

package com.xworkz.inheritances1.internal;

public class ShoeTester {
    public void test(Shoe shoe) {
        System.out.println("Testing shoe...");
        shoe.turnOn();
        shoe.operate();
        shoe.connect();
        shoe.performTask();
        shoe.shutDown();

        if (shoe instanceof SportsShoe) {
            System.out.println("Shoe is a SportsShoe -- casting and invoking specific method");
            SportsShoe sport = (SportsShoe) shoe;
            sport.cleanShoe();
        }
    }
}

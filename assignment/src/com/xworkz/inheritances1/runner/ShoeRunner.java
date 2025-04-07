package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.Shoe;
import com.xworkz.inheritances1.internal.SportsShoe;
import com.xworkz.inheritances1.internal.ShoeTester;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe();
        shoe1.turnOn();
        shoe1.operate();
        shoe1.connect();
        shoe1.performTask();
        shoe1.shutDown();

        System.out.println("-----------");

        Shoe shoe2 = new SportsShoe();
        shoe2.turnOn();
        shoe2.operate();
        shoe2.connect();
        shoe2.performTask();
        shoe2.shutDown();

        System.out.println("-----------");

        SportsShoe sport = new SportsShoe();
        sport.turnOn();
        sport.operate();
        sport.connect();
        sport.performTask();
        sport.shutDown();

        System.out.println("------casting------");

        ShoeTester tester = new ShoeTester();
        tester.test(shoe1);
        tester.test(shoe2);
        tester.test(sport);
    }
}

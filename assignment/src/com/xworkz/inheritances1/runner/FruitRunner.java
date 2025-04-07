package com.xworkz.inheritances1.runner;

import com.xworkz.inheritances1.internal.Fruit;
import com.xworkz.inheritances1.internal.Mango;
import com.xworkz.inheritances1.internal.FruitTester;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();
        fruit1.grow();
        fruit1.ripen();
        fruit1.harvest();
        fruit1.sell();
        fruit1.eat();

        System.out.println("-----------");

        Fruit fruit2 = new Mango();
        fruit2.grow();
        fruit2.ripen();
        fruit2.harvest();
        fruit2.sell();
        fruit2.eat();

        System.out.println("-----------");

        Mango mango = new Mango();
        mango.grow();
        mango.ripen();
        mango.harvest();
        mango.sell();
        mango.eat();
        mango.makeJuice();

        System.out.println("------casting------");

        FruitTester tester = new FruitTester();
        tester.test(fruit1);
        tester.test(fruit2);
        tester.test(mango);
    }
}

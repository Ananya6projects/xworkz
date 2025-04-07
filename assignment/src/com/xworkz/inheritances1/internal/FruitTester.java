package com.xworkz.inheritances1.internal;

public class FruitTester {
    public void test(Fruit fruit) {
        System.out.println("Testing fruit...");
        fruit.grow();
        fruit.ripen();
        fruit.harvest();
        fruit.sell();
        fruit.eat();

        if (fruit instanceof Mango) {
            System.out.println("Fruit is Mango -- casting and invoking specific method");
            Mango mango = (Mango) fruit;
            mango.makeJuice();
        }
    }
}

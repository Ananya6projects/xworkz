package com.xworkz.tostring.MultiLevel;

public class Organism {
    void live() {
        System.out.println("Organism lives");
    }
}

class Animal2 extends Organism {
    void move() {
        System.out.println("Animal moves");
    }
    class Tiger extends Animal2 {
        void hunt() {
            System.out.println("Tiger is hunting");
        }
    }
}

package com.xworkz.tostring.Hierarchichal;

public class Animal {
    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}



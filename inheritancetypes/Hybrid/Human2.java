package com.xworkz.tostring.Hybrid;

interface Speaker {
    void speak();
}
public class Human2 {
    void breathe() {
        System.out.println("Human breathing");
    }
}

class Teacher extends Human2 implements Speaker {
    public void speak() {
        System.out.println("Teacher speaking");
    }
}

interface Storable {
    void store();
}

class Product {
    void tag() {
        System.out.println("Product tagged");
    }
}

class Box extends Product implements Storable {
    public void store() {
        System.out.println("Box storing product");
    }
}


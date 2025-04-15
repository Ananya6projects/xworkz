package com.xworkz.tostring.Hierarchichal;

public class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Parrot extends Bird {
    void mimic() {
        System.out.println("Parrot mimics");
    }
}

class Crow extends Bird {
    void caw() {
        System.out.println("Crow caws");
    }
}

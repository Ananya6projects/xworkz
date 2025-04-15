package com.xworkz.tostring.MultiLevel;

public class Building {
    void enter() {
        System.out.println("Entering building");
    }
}

class House extends Building {
    void sleep() {
        System.out.println("Sleeping in the house");
    }
}

class Villa extends House {
    void party() {
        System.out.println("Party in the villa");
    }
}


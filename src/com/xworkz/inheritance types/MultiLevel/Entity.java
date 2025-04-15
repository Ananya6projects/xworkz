package com.xworkz.tostring.MultiLevel;

public class Entity {
    void react() {
        System.out.println("Entity reacting");
    }
}

class LivingEntity extends Entity {
    void adapt() {
        System.out.println("LivingEntity adapting");
    }
}

class Dolphin extends LivingEntity {
    void sonar() {
        System.out.println("Dolphin using sonar");
    }
}

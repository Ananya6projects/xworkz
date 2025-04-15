package com.xworkz.tostring.MultiLevel;

public class OrganismBase {
    void grow() {
        System.out.println("OrganismBase is growing");
    }
}

class FloweringPlant extends OrganismBase {
    void bloom() {
        System.out.println("FloweringPlant blooming");
    }
}

class Rose extends FloweringPlant {
    void fragrance() {
        System.out.println("Rose has fragrance");
    }
}

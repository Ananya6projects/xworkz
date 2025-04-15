package com.xworkz.tostring.SingleLevel;

public class Heater {
    void warmUp() {
        System.out.println("Heater warming up");
    }
}

class WaterHeater extends Heater {
    void boilWater() {
        System.out.println("Water heater is boiling water");
    }
}

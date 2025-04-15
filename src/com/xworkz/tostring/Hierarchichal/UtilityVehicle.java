package com.xworkz.tostring.Hierarchichal;

public class UtilityVehicle {
    void engineStart() {
        System.out.println("UtilityVehicle engine started");
    }
}

class Pickup extends UtilityVehicle {
    void carryLoad() {
        System.out.println("Pickup is carrying load");
    }
}

class MountainBike extends UtilityVehicle {
    void climbSlope() {
        System.out.println("MountainBike climbing slope");
    }
}

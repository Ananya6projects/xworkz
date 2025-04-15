package com.xworkz.tostring.MultiLevel;

public class GearBox {
    void shift() {
        System.out.println("GearBox is shifting");
    }
}

class ManualGearBox extends GearBox {
    void engageClutch() {
        System.out.println("Engaging clutch");
    }
}

class SportsGearBox extends ManualGearBox {
    void turboMode() {
        System.out.println("SportsGearBox in turbo mode");
    }
}

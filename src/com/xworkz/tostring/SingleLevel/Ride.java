package com.xworkz.tostring.SingleLevel;

public class Ride {
    void operate() {
        System.out.println("Ride operating");
    }
}

class Bicycle extends Ride {
    void ringBell() {
        System.out.println("Bicycle bell rings");
    }
}

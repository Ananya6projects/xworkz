package com.xworkz.tostring.Hybrid;

interface Transmitter {
    void transmit();
}
public class ControlUnit {
    void regulate() {
        System.out.println("ControlUnit regulating system");
    }
}

class AIController extends ControlUnit implements Transmitter {
    public void transmit() {
        System.out.println("AIController transmitting commands");
    }
}

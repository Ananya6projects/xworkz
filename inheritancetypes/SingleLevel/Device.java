package com.xworkz.tostring.SingleLevel;

public class Device {
    void charge() {
        System.out.println("Device is charging");
    }
}

class Phone extends Device {
    void ring() {
        System.out.println("Phone is ringing");
    }
}

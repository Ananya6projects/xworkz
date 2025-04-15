package com.xworkz.tostring.Hybrid;

public class SmartPhone extends Mobile implements Camera {
    public void capture() {
        System.out.println("SmartPhone taking photo");
    }
}

package com.xworkz.inherit;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Smartphone();
        phone.call();
        phone.message();
        phone.camera();
        phone.battery();
        phone.internet();

        System.out.println("----------");
        Smartphone smartphone=new Smartphone();
        smartphone.call();
        smartphone.message();
        smartphone.camera();
        smartphone.battery();
        smartphone.internet();

    }
}

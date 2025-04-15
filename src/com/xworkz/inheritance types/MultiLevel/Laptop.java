package com.xworkz.tostring.MultiLevel;

public class Laptop extends Computer{
    void carry() {
        System.out.println("Laptop is portable");
    }
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.boot();
        laptop.carry();
    }
}

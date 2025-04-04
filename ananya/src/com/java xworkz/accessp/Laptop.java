package com.xworkz.accessp;

public class Laptop {
    public String processor = "Intel i7";
    public String os = "Windows 11";
    private double price = 55000.50;

    public void showModel() {
        System.out.println("Laptop OS: " + this.os);
    }

    private void showPrice() {
        System.out.println("Price: " + this.price);
    }
}

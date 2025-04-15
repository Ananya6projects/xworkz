package com.xworkz.tostring.vehicle;

public class Furniture {
    String type;
    String material;
    double price;
    String color;

    Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
        this.color = "Unknown";
    }

    Furniture(String type, String material, String color) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = 0.0;
    }

    Furniture(String type, double price, String color) {
        this.type = type;
        this.price = price;
        this.color = color;
        this.material = "Unknown";
    }

    void showDetails() {
        System.out.println("Type: " + type + ", Material: " + material + ", Price: " + price + ", Color: " + color);
    }
}

package com.xworkz.tostring.SingleLevel;

public class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
    }
}

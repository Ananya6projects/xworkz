package com.xworkz.accessp;

public class Car {
        public String fuelType = "Petrol";
        public String model = "Corolla";
        public String brand = "Toyota";
        private int speed = 120;

        public void showBrand() {
            System.out.println("Brand: " + this.brand);
        }

        private void showSpeed() {
            System.out.println("Speed: " + this.speed);
        }
    }



package com.xworkz.accessp;

public class Phone {
    public String operatingSystem = "Android";
    public String model = "Galaxy S23";
    private String number = "9876543210";

    public void showBrand() {
        System.out.println("Phone Model: " + this.model);
    }

    private void showNumber() {
        System.out.println("Phone Number: " + this.number);
    }
}

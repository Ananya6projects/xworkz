package com.xworkz.tostring.SingleLevel;

public class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void radius() {
        System.out.println("Circle radius measured");
    }
}

package com.xworkz.tostring.vehicle;

public class chair extends Furniture {
    public chair(String type, String material, double price) {
        super(type, material, price);
    }
}
  class Table extends Furniture{
public Table(String type, String material, String color) {
            super(type, material, color);
        }
    }
class Sofa extends Furniture {
    Sofa(String type, double price, String color) {
        super(type, price, color);
    }
}
class Bed extends Furniture {
    Bed(String type, String material, double price) {
        super(type, material, price);
    }
}
class Cupboard extends Furniture {
    Cupboard(String type, double price, String color) {
        super(type, price, color);
    }
}

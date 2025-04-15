package com.xworkz.tostring.vehicle;

public class FurnitureMain {
    public static void main(String[] args) {
        Furniture chair = new chair("Chair", "Wood", 2500);
        Furniture table = new Table("Table", "Steel", "Black");
        Furniture sofa = new Sofa("Sofa", 12000, "Grey");
        Furniture bed = new Bed("Bed", "Iron", 8500);
        Furniture cupboard = new Cupboard("Cupboard", 6700, "Brown");

        chair.showDetails();
        table.showDetails();
        sofa.showDetails();
        bed.showDetails();
        cupboard.showDetails();
    }
}

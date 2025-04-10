package com.xworkz.tostring.inner;

public class Laptop {
    private String brand;
    private int ram;
    private boolean hasSSD;

    public Laptop(String brand, int ram, boolean hasSSD) {
        this.brand = brand;
        this.ram = ram;
        this.hasSSD = hasSSD;
    }

    @Override
    public String toString() {
<<<<<<< HEAD

        return "Laptop [brand=" + brand + ", ram=" + ram + "GB, hasSSD=" + hasSSD + "]";
    }
    @Override
    public int hashCode() {
        return 10;
    }
}

=======
        return "Laptop [brand=" + brand + ", ram=" + ram + "GB, hasSSD=" + hasSSD + "]";
    }
}
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26

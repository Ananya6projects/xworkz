package com.xworkz.tostring.Hybrid;

interface EcoFriendly {
    void recycle();
}

public class PackagingMaterial {
    void wrap() {
        System.out.println("PackagingMaterial wrapping item");
    }
}

class Cardboard extends PackagingMaterial implements EcoFriendly {
    public void recycle() {
        System.out.println("Cardboard is being recycled");
    }
}

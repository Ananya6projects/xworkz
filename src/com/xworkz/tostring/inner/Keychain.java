package com.xworkz.tostring.inner;

public class Keychain {
    private String material;
    private int keysHeld;
    private boolean hasLight;

    public Keychain(String material, int keysHeld, boolean hasLight) {
        this.material = material;
        this.keysHeld = keysHeld;
        this.hasLight = hasLight;
    }

    @Override
    public String toString() {
        return "Keychain [material=" + material + ", keysHeld=" + keysHeld + ", hasLight=" + hasLight + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 92;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

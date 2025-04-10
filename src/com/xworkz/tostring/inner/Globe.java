package com.xworkz.tostring.inner;

public class Globe {
    private String size;
<<<<<<< HEAD
    private int standMaterial;
    private boolean politicalMap;

    public Globe(String size, int standMaterial, boolean politicalMap) {
=======
    private String standMaterial;
    private boolean politicalMap;

    public Globe(String size, String standMaterial, boolean politicalMap) {
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
        this.size = size;
        this.standMaterial = standMaterial;
        this.politicalMap = politicalMap;
    }

    @Override
    public String toString() {
        return "Globe [size=" + size + ", standMaterial=" + standMaterial + ", politicalMap=" + politicalMap + "]";
    }
<<<<<<< HEAD
    @Override
    public int hashCode() {
        return 86;
    }
=======
>>>>>>> 2bbdda669c66c39b95e494046f8469410ab57e26
}

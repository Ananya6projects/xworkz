package com.xworkz.tostring.inner;

public class Globe {
    private String size;
    private int standMaterial;
    private boolean politicalMap;

    public Globe(String size, int standMaterial, boolean politicalMap) {
        this.size = size;
        this.standMaterial = standMaterial;
        this.politicalMap = politicalMap;
    }

    @Override
    public String toString() {
        return "Globe [size=" + size + ", standMaterial=" + standMaterial + ", politicalMap=" + politicalMap + "]";
    }
    @Override
    public int hashCode() {
        return 86;
    }
}

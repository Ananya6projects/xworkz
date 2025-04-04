package com.xworkz.inheritances1;

public class Exoplanet extends ExoplanetParent {

    @Override
    void category() {
        System.out.println("Category: Exoplanets are planets orbiting stars outside our solar system.");
    }

    @Override
    void firstDiscovered() {
        System.out.println("First Discovered: 1992 - PSR B1257+12 planets, first around a pulsar.");
    }

    @Override
    void exoplanetDetection() {
        System.out.println("Detection Methods: Transit Photometry, Radial Velocity, Direct Imaging, Microlensing");
    }

    @Override
    void habitableZone() {
        System.out.println("Habitable Zone: Region around a star where liquid water could exist on a planet's surface.");
    }

    @Override
    void exoplanetAtmosphere() {
        System.out.println("Atmosphere: Can include water vapor");
    }
}

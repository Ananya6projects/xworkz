package com.xworkz.inheritances1;

public class Ansteroid extends AnsteroidParent {

    @Override
    void category() {
        System.out.println("Category: Asteroids are minor planets in the Solar System.");
    }

    @Override
    void largestAsteroid() {
        System.out.println("Largest Asteroid: Vesta, second largest after Ceres.");
    }

    @Override
    void asteroidBelt() {
        System.out.println("Asteroid Belt: Contains millions of irregularly shaped bodies.");
    }

    void asteroidTypes() {
        System.out.println("Types: C-type, S-type, M-type");
    }

    void nearEarthAsteroids() {
        System.out.println("NEAs: Potential Threat to Earth");
    }

    void asteroidMissions() {
        System.out.println("Missions: OSIRIS-REx, Hayabusa2");
    }

    void asteroidMining() {
        System.out.println("Mining Potential: Metals and Water");
    }

    void asteroidDeflection() {
        System.out.println("Deflection Methods: Kinetic Impact, Gravity Tractor");
    }
}

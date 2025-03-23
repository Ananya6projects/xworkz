package com.xworkz.assignment;
public class Country {
    String name;
    long population;
    String currency;
    PrimeMinister primeMinister = new PrimeMinister("Narendra Modi", 73, 20);

    Country(String name, long population, String currency) {
        this.name = name;
        this.population = population;
        this.currency = currency;
    }

    void display() {
        primeMinister.display();
    }
}

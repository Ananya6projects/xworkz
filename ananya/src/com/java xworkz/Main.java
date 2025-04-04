package com.xworkz.assignment;
public class Main {
    public static void main(String[] args) {

        PrimeMinister primeMinister = new PrimeMinister("Narendra Modi", 73, 10);

        primeMinister.display();

        System.out.println("\n===== Individual Component Testing =====");


        Minister minister = new Minister("Nirmala Sitharaman", "Finance");
        minister.display();


        PersonalAssistant assistant = new PersonalAssistant("John", "PA106", 9988776655L);
        assistant.display();


        Portfolio portfolio = new Portfolio("Technology", 3000000L);
        portfolio.display();


        House house = new House();
        house.display();


        Security security = new Security();
        security.display();

        System.out.println("\n===== End of Program =====");
    }
}

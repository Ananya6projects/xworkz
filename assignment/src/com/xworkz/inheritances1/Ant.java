package com.xworkz.inheritances1;

public class Ant extends AntParent {
    @Override
    void speciesInfo() {
        System.out.println("Species Info: Ants belong to the family Formicidae.");
    }

    @Override
    void colonyType() {
        System.out.println("Colony Type: Ant colonies are structured with a queen, workers, and soldiers.");
    }

    @Override
    void bodyStructure() {
        System.out.println("Body Structure: Ants have a segmented body with a narrow waist and elbowed antennae.");
    }

    void habitat() {
        System.out.println("Habitat: Underground colonies, soil, inside wood, and under rocks");
    }

    void communication() {
        System.out.println("Communication: Using pheromones and antennae");
    }

    void speciesCount() {
        System.out.println("Species Count: Over 12,000 known species");
    }

    void foodHabit() {
        System.out.println("Food Habit: Omnivorous - eats sugary substances, proteins, and fats");
    }

    void interestingFact() {
        System.out.println("Interesting Fact: Ants can carry objects 10–50 times their body weight");
    }
}

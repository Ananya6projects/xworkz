package com.xworkz.inheritances1;

public class Forest extends ForestParent {

    @Override
    void category() {
        System.out.println("Category: A forest is a large area dominated by trees and rich biodiversity.");
    }

    @Override
    void largestForest() {
        System.out.println("Largest Forest: The Amazon Rainforest, spanning 9 countries in South America.");
    }

    @Override
    void biodiversity() {
        System.out.println("Biodiversity: Home to millions of plant, animal, and insect species.");
    }

    @Override
    void forestArea() {
        System.out.println("Total Area: The Amazon covers approximately 5.5 million square kilometers.");
    }

    @Override
    void forestImportance() {
        System.out.println("Importance: Forests absorb carbon dioxide and release oxygen, vital for life on Earth.");
    }
}

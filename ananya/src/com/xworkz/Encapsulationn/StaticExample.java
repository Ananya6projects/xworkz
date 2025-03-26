package com.xworkz.Encapsulationn;

public class StaticExample {


        static String companyName = "Xworkz";


        static {
            System.out.println("Static block executed!");
            companyName = "Xworkz Rajajinagar";
        }

        // Regular method
        void display() {
            System.out.println("Company: " + companyName);
        }
    }

